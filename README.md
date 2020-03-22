### Spring-cloud-netflix

#### 概述

Spring Cloud 为开发人员提供了快速构建分布式系统中一些常见模式的工具（例如配置管理，服务发现，断路器，智能路由，微代理，控制总线）。分布式系统的协调导致了样板模式, 使用 Spring Cloud 开发人员可以快速地支持实现这些模式的服务和应用程序。他们将在任何分布式环境中运行良好，包括开发人员自己的笔记本电脑，裸机数据中心，以及 Cloud Foundry 等托管平台。

由于 Spring Cloud Netflix 项目已进入维护期。这意味着继续使用它再也没有新功能福利了；故我们采用 **Spring Cloud Alibaba** 方案来替代 Spring Cloud Netflix。

#### 项目进入维护期

[【官方新闻】Spring Cloud Greenwich.RC1 available now](http://www.qfdmy.com/wp-content/themes/quanbaike/go.php?url=aHR0cHM6Ly9zcHJpbmcuaW8vYmxvZy8yMDE4LzEyLzEyL3NwcmluZy1jbG91ZC1ncmVlbndpY2gtcmMxLWF2YWlsYWJsZS1ub3c=)

**2018 年 12 月 12 日，Netflix 宣布 Spring Cloud Netflix 系列技术栈进入维护模式（不再添加新特性）**

最近，Netflix 宣布 `Hystrix` 正在进入维护模式。自 2016 年以来，`Ribbon` 已处于类似状态。虽然 Hystrix 和 Ribbon 现已处于维护模式，但它们仍然在 Netflix 大规模部署。

`Hystrix Dashboard` 和 `Turbine` 已被 **Atlas** 取代。这些项目的最后一次提交分别是 2 年前和 4 年前。`Zuul1` 和 `Archaius1` 都被后来不兼容的版本所取代。

以下 Spring Cloud Netflix 模块和相应的 Starter 将进入维护模式：

- spring-cloud-netflix-archaius
- spring-cloud-netflix-hystrix-contract
- spring-cloud-netflix-hystrix-dashboard
- spring-cloud-netflix-hystrix-stream
- spring-cloud-netflix-hystrix
- spring-cloud-netflix-ribbon
- spring-cloud-netflix-turbine-stream
- spring-cloud-netflix-turbine
- spring-cloud-netflix-zuul

#### 什么是维护模式

将模块置于维护模式，意味着 Spring Cloud 团队将不会再向模块添加新功能。我们将修复 block 级别的 bug 以及安全问题，我们也会考虑并审查社区的小型 pull request。

#### 替代品

我们建议对这些模块提供的功能进行以下替换

| CURRENT                     | REPLACEMENT                                       |
| :-------------------------- | :------------------------------------------------ |
| Hystrix                     | Resilience4j                                      |
| Hystrix Dashboard / Turbine | Micrometer + Monitoring System                    |
| Ribbon                      | Spring Cloud Loadbalancer                         |
| Zuul 1                      | Spring Cloud Gateway                              |
| Archaius 1                  | Spring Boot external config + Spring Cloud Config |

### Spring-cloud-alibaba

#### 概述

**2018 年 10 月 31 日的凌晨，这个伟大的日子里，Spring Cloud Alibaba 正式入驻了 Spring Cloud 官方孵化器，并在 Maven 中央库发布了第一个版本。**

[Spring Cloud for Alibaba 0.2.0 released](http://www.qfdmy.com/wp-content/themes/quanbaike/go.php?url=aHR0cHM6Ly9zcHJpbmcuaW8vYmxvZy8yMDE4LzEwLzMwL3NwcmluZy1jbG91ZC1mb3ItYWxpYmFiYS0wLTItMC1yZWxlYXNlZA==)

> The Spring Cloud Alibaba project, consisting of Alibaba’s open-source components and several Alibaba Cloud products, aims to implement and expose well known Spring Framework patterns and abstractions to bring the benefits of Spring Boot and Spring Cloud to Java developers using Alibaba products.
>
> Spring Cloud for Alibaba，它是由一些阿里巴巴的开源组件和云产品组成的。这个项目的目的是为了让大家所熟知的 Spring 框架，其优秀的设计模式和抽象理念，以给使用阿里巴巴产品的 Java 开发者带来使用 Spring Boot 和 Spring Cloud 的更多便利。

Spring Cloud Alibaba 致力于提供微服务开发的一站式解决方案。此项目包含开发分布式应用微服务的必需组件，方便开发者通过 Spring Cloud 编程模型轻松使用这些组件来开发分布式应用服务。

依托 Spring Cloud Alibaba，您只需要添加一些注解和少量配置，就可以将 Spring Cloud 应用接入阿里微服务解决方案，通过阿里中间件来迅速搭建分布式应用系统。

[Spring Cloud Alibaba GitHub](http://www.qfdmy.com/wp-content/themes/quanbaike/go.php?url=aHR0cHM6Ly9naXRodWIuY29tL3NwcmluZy1jbG91ZC1pbmN1YmF0b3Ivc3ByaW5nLWNsb3VkLWFsaWJhYmEvYmxvYi9tYXN0ZXIvUkVBRE1FLXpoLm1k)

#### 主要功能

- **服务限流降级：** 默认支持 Servlet、Feign、RestTemplate、Dubbo 和 RocketMQ 限流降级功能的接入，可以在运行时通过控制台实时修改限流降级规则，还支持查看限流降级 Metrics 监控。
- **服务注册与发现：** 适配 Spring Cloud 服务注册与发现标准，默认集成了 Ribbon 的支持。
- **分布式配置管理：** 支持分布式系统中的外部化配置，配置更改时自动刷新。
- **消息驱动能力：** 基于 Spring Cloud Stream 为微服务应用构建消息驱动能力。
- **阿里云对象存储：** 阿里云提供的海量、安全、低成本、高可靠的云存储服务。支持在任何应用、任何时间、任何地点存储和访问任意类型的数据。
- **分布式任务调度：** 提供秒级、精准、高可靠、高可用的定时（基于 Cron 表达式）任务调度服务。同时提供分布式的任务执行模型，如网格任务。网格任务支持海量子任务均匀分配到所有 Worker（schedulerx-client）上执行。

#### 组件

- **Sentinel：** 把流量作为切入点，从流量控制、熔断降级、系统负载保护等多个维度保护服务的稳定性。
- **Nacos：** 一个更易于构建云原生应用的动态服务发现、配置管理和服务管理平台。
- **RocketMQ：** 一款开源的分布式消息系统，基于高可用分布式集群技术，提供低延时的、高可靠的消息发布与订阅服务。
- **Dubbo：** Apache Dubbo™ 是一款高性能 Java RPC 框架。
- **Seata：** 阿里巴巴开源产品，一个易于使用的高性能微服务分布式事务解决方案。
- **Alibaba Cloud ACM：** 一款在分布式架构环境中对应用配置进行集中管理和推送的应用配置中心产品。
- **Alibaba Cloud OSS：** 阿里云对象存储服务（Object Storage Service，简称 OSS），是阿里云提供的海量、安全、低成本、高可靠的云存储服务。您可以在任何应用、任何时间、任何地点存储和访问任意类型的数据。
- **Alibaba Cloud SchedulerX：** 阿里中间件团队开发的一款分布式任务调度产品，提供秒级、精准、高可靠、高可用的定时（基于 Cron 表达式）任务调度服务。
- **Alibaba Cloud SMS：** 覆盖全球的短信服务，友好、高效、智能的互联化通讯能力，帮助企业迅速搭建客户触达通道。

#### 注意：Spring Cloud Alibaba 已毕业

**Spring Cloud Alibaba 已于 2019 年 7 月 30 日** 从 Spring Cloud 孵化器中正式毕业并迎来了毕业的第一个版本，孵化器中的 Spring Cloud Alibaba 仓库迁移回 Alibaba 官方仓库，进行正式的毕业发布，对原有使用 Spring Cloud Alibaba 开发的项目影响如下：

##### 更新包名和 Maven 坐标

接到阿里官方通知在 2019 年 7 月 4 日修改相关包名和 Maven 坐标，请参考 [Update package name & maven coordinates](http://www.qfdmy.com/wp-content/themes/quanbaike/go.php?url=aHR0cHM6Ly9naXRodWIuY29tL2FsaWJhYmEvc3ByaW5nLWNsb3VkLWFsaWJhYmEvaXNzdWVzLzczNA==) ，由于视频录制于 2019 年 6 月 28 日，故所使用的包名和坐标依然沿用原先的 `org.springframework.cloud`，后面的视频会改用最新的标准，看到这里的小伙伴可以尝试使用新坐标。

##### 包名修改

包名前缀由 `org.springframework.cloud.alibaba` 变更为 `com.alibaba.cloud`

##### Maven 坐标修改

bom 由 `spring-cloud-alibaba-dependencies` 变更为 `alibaba-spring-cloud-dependencies`

maven groupid 由 `org.springframework.cloud` 变更为 `com.alibaba.cloud`

|                                 | 修改前                                       | 修改后                                       |
| :------------------------------ | :------------------------------------------- | :------------------------------------------- |
| sentinel starter                | spring-cloud-starter-alibaba-sentinel        | alibaba-sentinel-spring-cloud-starter        |
| nacos config starter            | spring-cloud-starter-alibaba-nacos-config    | alibaba-nacos-config-spring-cloud-starter    |
| nacos discovery starter         | spring-cloud-starter-alibaba-nacos-discovery | alibaba-nacos-discovery-spring-cloud-starter |
| seata starter                   | spring-cloud-starter-alibaba-seata           | alibaba-seata-spring-cloud-starter           |
| dubbo starter                   | spring-cloud-starter-dubbo                   | dubbo-spring-cloud-starter                   |
| rocketmq binder starter         | spring-cloud-starter-stream-rocketmq         | rocketmq-stream-spring-cloud-starter         |
| rocketmq bus module name        | spring-cloud-starter-bus-rocketmq            | rocketmq-bus-spring-cloud-starter            |
| sentinel module name            | spring-cloud-alibaba-sentinel                | alibaba-sentinel-spring-cloud                |
| sentinel datasource module name | spring-cloud-alibaba-sentinel-datasource     | alibaba-sentinel-datasource-spring-cloud     |
| sentinel gateway module name    | spring-cloud-alibaba-sentinel-gateway        | alibaba-sentinel-gateway-spring-cloud        |
| nacos config module name        | spring-cloud-alibaba-nacos-config            | alibaba-nacos-config-spring-cloud            |
| nacos discovery module name     | spring-cloud-alibaba-nacos-discovery         | alibaba-nacos-discovery-spring-cloud         |
| dubbo module name               | spring-cloud-alibaba-dubbo                   | alibaba-dubbo-spring-cloud                   |
| seata module name               | spring-cloud-alibaba-seata                   | alibaba-seata-spring-cloud                   |
| rocketmq binder module name     | spring-cloud-stream-binder-rocketmq          | rocketmq-spring-cloud-stream-binder          |

##### Spring Cloud Alicloud(商业化组件)

|                        | 修改前                           | 修改后                           |
| :--------------------- | :------------------------------- | :------------------------------- |
| oss starter            | spring-cloud-alicloud-oss        | alicloud-oss-spring-cloud        |
| sms starter            | spring-cloud-alicloud-sms        | alicloud-sms-spring-cloud        |
| schedulerx starter     | spring-cloud-alicloud-schedulerx | alicloud-schedulerx-spring-cloud |
| ans starter            | spring-cloud-alicloud-ans        | alicloud-ans-spring-cloud        |
| acm starter            | spring-cloud-alicloud-acm        | alicloud-acm-spring-cloud        |
| oss module name        | spring-cloud-alicloud-oss        | alicloud-oss-spring-cloud        |
| sms module name        | spring-cloud-alicloud-sms        | alicloud-sms-spring-cloud        |
| schedulerx module name | spring-cloud-alicloud-schedulerx | alicloud-schedulerx-spring-cloud |
| ans module name        | spring-cloud-alicloud-ans        | alicloud-ans-spring-cloud        |
| acm module name        | spring-cloud-alicloud-acm        | alicloud-acm-spring-cloud        |

### 本项目笔记地址：

http://note.youdao.com/noteshare?id=e21e0cf93f227b834e99600374ed6a75