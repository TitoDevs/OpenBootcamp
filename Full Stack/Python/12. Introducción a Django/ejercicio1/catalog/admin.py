from django.contrib import admin

# Register your models here.
from .models import Author, Genre, Movie, MovieInstance

admin.site.register(Author)
admin.site.register(Genre)
admin.site.register(Movie)
admin.site.register(MovieInstance)
