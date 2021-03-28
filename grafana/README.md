&copy; Copyright (c) 2021, Ritesh. All rights reserved.
# Grafana Setup 
Grafana services with docker/docker-compose:
##### Docker run command::
    docker run -d -p 3000:3000 --name grafana grafana/grafana:6.5.0

##### Create a docker-compose.yaml and execute following commands:
    docker-compose up -d
    
Grafana URL: http://192.168.68.120:3000

#### Architecture Diagram:
            
   ![Architecture](design-diagrams/architecture-diagram-2.png)



> References: 
 *	https://grafana.com/docs/grafana/latest/installation/docker/
 *	https://grafana.com/grafana/dashboards/893
 
 
 
 
 