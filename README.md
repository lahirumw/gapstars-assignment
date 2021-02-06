# Gapstars Assignment

<b>Requirment</b></br>
Limit the number of request to the API from particular client within a define time period.

<b>Design</b></br>
AAs we think of the requirement, this is a kind of security requirement and this type of rules implement in the proxy.

<b>Architecture Diagram</b></br>

![Architech Diagram](/images/archi-diagram.jpg)



<b>Steps to start the application</b>

1. Create the docker image

docker build -t micservice;

2. Spin up two containers using the image
 
docker run --name micservice1 -d -p 8080:8080 micservice:latest;</br>
docker run --name micservice2 -d -p 8081:8080 micservice:latest;

3. Apply the changes in proxy config file and reload the proxy server.
sudo vi /etc/haproxy/haproxy.cfg;
sudo systemctl restart haproxy;

4. Once you call the API more the 10 times within 5 mins. The proxy will return below response.</br>
<i>429 Too Many Requests
You have sent too many requests in a given amount of time.
</i>
