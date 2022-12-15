from django.conf.urls import url

from catalog import views

urlpatterns = [
    url(r'^$', views.index, name='index')
]
