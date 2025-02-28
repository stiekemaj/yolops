# YOLOps - DevOps Dashboard

## Introduction

[Reference: ChatGPT Thread](https://chat.openai.com/) *
YOLOps is a DevOps dashboard designed to provide an **overview of running services**, monitor **security risks**, track **open pull requests**, and enable **quick deployments** to various environments.

> "Because sometimes we deploy without thinking."

## Purpose
YOLOps aims to provide a **practical and efficient solution** to common DevOps challenges, enhancing team productivity and security. Each feature is designed with a clear **reasoning and impact** in mind.
YOLOps aims to:
- Offer a **real-time overview** of running services and related URLs, allowing engineers to **quickly access applications and troubleshoot issues**.
- Display **open pull requests**, sorted by duration, to **prioritize long-pending reviews** and prevent bottlenecks in the development process.
- Enable **quick deployments** to test and acceptance environments, reducing manual steps and ensuring **faster iteration cycles**.
- Provide **security monitoring**, including CVE tracking and risk assessment, to ensure **early detection of vulnerabilities** and maintain system integrity.
- Serve as a learning project to improve **software development knowledge** in DevOps.

## Tech Stack
### Backend
- **Framework:** Spring Boot (chosen for its **maturity, ecosystem support, and reactive capabilities** with WebFlux).
- **Architecture:** Reactive WebFlux (selected to gain experience with **asynchronous, non-blocking programming** and better scalability).
- **Programming Language:** Java (preferred for its **strong ecosystem, reliability, and compatibility** with enterprise applications).
- **Testing Framework:** JUnit Jupiter (chosen for its **modern testing capabilities, flexibility, and integration with Spring Boot**).
- **Authentication:** OIDC (Keycloak/Entra ID) (leveraged for **secure, scalable, and centralized authentication**).
- **Database:** PostgreSQL (chosen for its **robustness, performance, and strong support for transactions**).

### Frontend
- **Framework:** React with TypeScript
- **Build Tool:** Vite (selected for its **faster development experience, instant HMR, and lightweight nature** compared to Webpack, Grunt, or Yeoman).
- **Styling:** To be determined (considering **Tailwind CSS for utility-first styling, shadcn/ui for component-based approach, Material UI for enterprise-ready components, and Chakra UI for accessibility-first design**).
- **Testing:**
  - **End-to-End:** Playwright
  - **Component Testing:** To be determined based on UI library

### Deployment
- **Containerization:** Docker
- **Orchestration:** Kubernetes (optional)
- **Hosting:** To be determined

### Key Tools & Integrations
- **CI/CD Pipelines:** Jenkins, Bitbucket Pipelines (integrated for **automated builds, testing, and deployments**).
- **Version Control:** GitHub (selected for its **collaborative features, robust CI/CD integration, and extensive community support**).
- **Security Monitoring:** Snyk for CVE tracking (used to **identify and mitigate vulnerabilities in dependencies**).

## Next Steps
- Finalize UI library choice for the frontend.
- Set up initial project repositories and Writerside documentation structure.

