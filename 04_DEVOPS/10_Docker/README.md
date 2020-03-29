# 4.10) Docker

Docker is a set of platform as a service (PaaS) products that uses OS-level virtualization to deliver software in packages called containers. Containers are isolated from one another and bundle their own software, libraries and configuration files; they can communicate with each other through well-defined channels. All containers are run by a single operating system kernel and therefore use fewer resources than virtual machines.

<details open>
<summary>Table of Contents</summary>
<br>

[Usefull Commands](#h1)

[USEFULL LINKS](#h2)

</details>

<a name="h1"/>

**Usefull Commands:**

Run a container image with the Ubuntu image on top.
```
docker container run -t ubuntu top
```

Inspect Linux processes:
```
top
```

Inspect the container:
```
docker container exec
```

Get the ID of the running containers:
```
docker container ls
```

Interact with bash shell inside container:
```
docker container exec -it <continer_ID> bash
```

To finish container interaction:
```
exit
```

Run a container in the background, publish and expose it on a port:
```
docker container run --detach --publish 8080:80 --name meu_nginx nginx
```

Run a container, specifiyng a version from Docker Hub:
```
docker container run --detach --publish 8081:27017 --name meu_mongo mongo:3.4
```

Stop a running container:
```
docker container stop <container_name>
```

Remove stopped containers:
```
docker system prune
```



<a name="h2"/>

**USEFUL LINKS**

**Docker Wikipedia:**

https://en.wikipedia.org/wiki/Docker_(software)

**Docker Playground:**
https://labs.play-woth-docker.com




