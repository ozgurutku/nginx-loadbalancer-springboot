# nginx-loadbalancer-springboot

Spring Boot Application Load Balancing with Nginx. 
<br>
https://blog.devgenius.io/load-balancing-a-spring-boot-application-with-nginx-and-docker-e701f74c011d I have benefited from this resource.

# Setup
`mvn compile jib:dockerBuild && docker-compose up`
With this command, everything necessary will be installed and the program will be run.

# Usage
In our application we have a get endpoint that returns the number and a post endpoint that updates the number. The default value of the number is 7. We created two of our application, we can access one via localhost:8088 and the other via localhost:8089. Nginx is running on localhost:9090. Nginx will balance incoming requests.
<br>
<br>
We send a post request to localhost:8088 and update the value of our number to 5. (You can also choose localhost:8089).
<br>
We change the number with the following command.
<br>
`curl -XPOST localhost:8088?number=5`
<br>
<br>
We send a get request to localhost:9090 repeatedly and we see that the number comes as 5 and 7, alternating. This is proof that nginx is load balancing.
<br>
We fetch the number with the following command.
<br>
`curl -XGET localhost:9090`
