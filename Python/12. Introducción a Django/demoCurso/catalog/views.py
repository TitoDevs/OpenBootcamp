from django.shortcuts import render
from .models import Book, Author, BookInstance, Genre


# Create your views here.

def index(request):
    num_books = Book.objects.all().count()
    num_instances = BookInstance.objects.all().count()
    num_authors = Author.objects.all().count()

    available = BookInstance.objets.filter(status__exact='a').count()

    return render(
        request,
        'index.html',
        context={
            'num_books': num_books,
            'num_authors': num_authors,
            'available': available,
            'num_instances': num_instances
        }
    )
