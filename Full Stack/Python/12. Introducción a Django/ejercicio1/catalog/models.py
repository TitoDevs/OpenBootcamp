from django.db import models
from django.urls import reverse
import uuid


# Create your models here.
class Genre(models.Model):
    name = models.CharField(max_length=64, help_text="Pon el nombre del género")

    def __str__(self):
        return self.name


class Movie(models.Model):
    title = models.CharField(max_length=32)
    author = models.ForeignKey('Author', on_delete=models.SET_NULL, null=True)
    summary = models.TextField(max_length=100, help_text="Pon aquí de que va el libro")
    genre = models.ManyToManyField(Genre)

    def __str__(self):
        return self.title

    def get_absolute_url(self):
        return reverse('movie-detail', args=[str(self.id)])


class MovieInstance(models.Model):
    id = models.UUIDField(primary_key=True, default=uuid.uuid4, help_text="ID único para esta pelicula")
    movie = models.ForeignKey('Book', on_delete=models.SET_NULL, null=True)
    imprint = models.CharField(max_length=200)
    due_back = models.DateField(null=True, blank=True)

    LOAN_STATUS = (
        ('a', 'Available'),
        ('c', 'Completed'),
    )

    status = models.CharField(max_length=1, choices=LOAN_STATUS, blank=True, default='c',
                              help_text='Disponibilidad de la pelicula')

    class Meta:
        ordering = ["due_back"]

    def __str__(self):
        return '%s (%s)' % (self.id, self.movie.title)


class Author(models.Model):
    first_name = models.CharField(max_length=100)
    last_name = models.CharField(max_length=100)
    date_of_birth = models.DateField(null=True, blank=True)
    date_of_death = models.DateField('Died', null=True, blank=True)

    def get_absolute_url(self):
        return reverse('author-detail', args=[str(self.id)])

    def __str__(self):
        return '%s, %s' % (self.last_name, self.first_name)
