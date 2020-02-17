# 运行

* eureka-server添加参数：server.port=8000

* eureka-service添加参数：server.port=8001;eureka.port=8000

* eureka-client添加参数：server.port=8002;eureka.port=8000

* nacos-service添加参数：server.port=8003

* nacos-client添加参数：server.port=8004

# 测试

* http://localhost:8002 eureka访问nacos服务

* http://localhost:8004 nacos访问eureka服务