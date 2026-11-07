Great! We can set up your **Spring Boot + HTML + Vanilla JavaScript + MySQL web application development environment on Ubuntu**, step by step.

We will use the following technology stack:

## 1. Development Stack

| Technology | Purpose |
|---|---|
| Java (JDK 21) | Backend programming |
| Spring Boot | Backend framework |
| HTML5 | Web page structure |
| CSS3 | Web page styling |
| Vanilla JavaScript | Frontend functionality |
| MySQL 8 | Database |
| Maven | Build and dependency management |
| VS Code | Code editor |
| Ubuntu | Operating system |

### 2. How the application will work



The communication flow will be:

1. User opens the HTML webpage.
2. JavaScript sends a request to Spring Boot.
3. Spring Boot processes the request.
4. Spring Boot communicates with MySQL.
5. MySQL returns the data.
6. Spring Boot sends a response to the webpage.

**Important:** MySQL is not normally preinstalled with Ubuntu. It is a separate database server that we can install.

## 3. Step 1 – Check your existing Ubuntu setup

Open your Ubuntu Terminal (`Ctrl + Alt + T`).

Copy and execute these commands **one by one**.

### A. Check Ubuntu version

```bash
lsb_release -a
```

### B. Check Java

```bash
java -version
```

Also check the Java compiler:

```bash
javac -version
```

Expected: Java 21 is a good choice for our project.

### C. Check Maven

```bash
mvn -version
```

Expected: Maven 3.6.3 or later.

### D. Check MySQL

```bash
mysql --version
```

Check whether MySQL server is running:

```bash
sudo systemctl status mysql
```

If it shows `Active: active (running)`, MySQL is already installed and running.

### E. Check Git

```bash
git --version
```

### F. Check VS Code

```bash
code --version
```

---

## 4. Step 2 – Install missing software

If the above checks show that Java, Maven, MySQL or Git is missing, you can install them using:

```bash
sudo apt update

sudo apt install openjdk-21-jdk maven mysql-server git curl -y
```

This installs:
- Java 21 JDK
- Maven
- MySQL Server
- Git
- cURL

Ubuntu provides MySQL through its package manager. [Ubuntu](https://ubuntu.com/server/docs/databases-mysql/?utm_source=chatgpt.com)

After installation, start MySQL:

```bash
sudo systemctl enable mysql
sudo systemctl start mysql
```

Verify:

```bash
sudo systemctl status mysql
```

## 5. Step 3 – VS Code

If VS Code is not installed, we can install it using Microsoft's official Ubuntu installation instructions.

Official guide: [VS Code for Linux](https://code.visualstudio.com/docs/setup/linux?utm_source=chatgpt.com)

Useful extensions for our project:

1. Extension Pack for Java
2. Spring Boot Extension Pack
3. Extension Pack for HTML, CSS and JavaScript
4. MySQL (database management extension)

## 6. Our final development environment

Once everything is installed, we will create this project:

```text
MyWebApplication/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/demo/
│       │       ├── DemoApplication.java
│       │       ├── controller/
│       │       ├── service/
│       │       ├── repository/
│       │       └── model/
│       │
│       └── resources/
│           ├── application.properties
│           └── static/
│               ├── index.html
│               ├── style.css
│               └── script.js
│
└── pom.xml
```

We will use Spring Boot REST APIs to connect the frontend with MySQL.

---

## 7. First task: Let us verify your Ubuntu

**For now, don't install anything manually.**

Run this complete diagnostic command in your Ubuntu terminal:

```bash
echo "========== UBUNTU =========="
lsb_release -a

echo "========== JAVA =========="
java -version
javac -version

echo "========== MAVEN =========="
mvn -version

echo "========== MYSQL =========="
mysql --version
sudo systemctl is-active mysql

echo "========== GIT =========="
git --version

echo "========== VS CODE =========="
code --version
```

**Copy and paste the complete terminal output here.**

I will check each component and tell you:

- ✅ Already installed and working.
- ❌ Missing – needs installation.
- ⚠️ Installed but requires configuration.

We will install only what is missing.

**Our goal:** Get your Ubuntu machine completely ready to develop and run a full-stack Spring Boot + HTML + Vanilla JavaScript + MySQL application locally.


# MySQL Setup

```bash
mysql -u root -p --socket=/var/run/mysqld/mysqld.sock
```

```bash
CREATE USER 'springuser'@'localhost'
IDENTIFIED BY 'Spring@12345';
```