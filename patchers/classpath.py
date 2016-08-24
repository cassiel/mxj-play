from java.net import URL, URLClassLoader
from java.lang import ClassLoader

cl = ClassLoader.getSystemClassLoader()
urls = cl.getURLs()

for url in urls:
    print(url.getFile())
