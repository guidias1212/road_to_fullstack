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

Build custom Docker image:
```
docker image build -t my-dockerimage-name .
```

Check image list:
```
docker image ls
```

Run a Docker image from local image:
```
docker run -p 5001:5000 -d docker-image-name
```

Check container logs:
```
docker container logs container-name
```

Tag the Dcoker image to match the Dcoker Hub convention (Or any other used by your company):
```
docker tag python-hello-world [dockerhub username]/python-hello-world
```

Push the Docker image to Docker Hub:
```
docker login

docker push [dockerhub username]/python-hello-world
```

Initialize the swarm (Docker orchestrator):
```
docker swarm init --advertise-addr eth0
```

Obs.: Check on the response from the previous command on how to add worker nodes to this Master node.

Verify the nodes cluster:
```
docker node ls
```

Concept: A SERVICE is an abstraction that represents multiple containers of the same image deployed across a distributed cluster.

Deploy a service:
```
docker service create --detach=true --name nginx1 --publish 80:80  --mount source=/etc/hostname,target=/usr/share/nginx/html/index.html,type=bind,ro nginx:1.12 pgqdxr41dpy8qwkn6qm7vke0q
```

<a name="h2"/>

**USEFUL LINKS**

**Docker Wikipedia:**

https://en.wikipedia.org/wiki/Docker_(software)

**Docker Playground:**
https://labs.play-woth-docker.com

**Docker documentation:**
https://docs.docker.com/


