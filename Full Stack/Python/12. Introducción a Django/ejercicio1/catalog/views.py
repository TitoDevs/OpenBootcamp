from django.shortcuts import render
from .models import Movie, Author, MovieInstance


# Create your views here.
def index(request):
    num_movies = Movie.objects.all().count()
    num_instances = MovieInstance.objects.all().count()
    num_authors = Author.objects.all().count()

    available = MovieInstance.objets.filter(status__exact='a').count()

    return render(
        request,
        'index.html',
        context={
            'num_movies': num_movies,
            'num_authors': num_authors,
            'available': available,
            'num_instances': num_instances
        }
    )
