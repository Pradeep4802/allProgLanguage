# I have created this file - Harry
from django.http import HttpResponse

def index(request):
    return HttpResponse("<h1>hello harry</h1>")
def about(request):
    return HttpResponse("About harry")