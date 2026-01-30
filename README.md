# 📊 Observabilidade com Spring Boot, Prometheus e Grafana

Projeto de estudo focado em **observabilidade** utilizando **Spring Boot 3**, **Java 21**, **Spring Web**, **Spring Boot Actuator**, **Prometheus** e **Grafana**, com todo o ambiente de monitoramento rodando via **Docker**.

O objetivo é aprender, na prática, como coletar, armazenar e visualizar métricas de uma aplicação Spring Boot.

---

## 🧰 Tecnologias Utilizadas

- ☕ Java 21  
- 🌱 Spring Boot 3  
- 🌐 Spring Web  
- ❤️ Spring Boot Actuator  
- 📈 Micrometer + Prometheus  
- 📊 Grafana  
- 🐳 Docker & Docker Compose  

---

## 📐 Arquitetura Simplificada

```text
[ Spring Boot App ]
        |
        |  /actuator/prometheus
        v
[ Prometheus ]
        |
        v
[ Grafana ]
