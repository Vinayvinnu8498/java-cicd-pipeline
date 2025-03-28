Started by user vinay
Obtained Jenkinsfile from git https://github.com/Vinayvinnu8498/java-cicd-pipeline.git
[Pipeline] Start of Pipeline
[Pipeline] node
Running on Jenkins in /var/jenkins_home/workspace/java-cicd-clean
[Pipeline] {
[Pipeline] stage
[Pipeline] { (Declarative: Checkout SCM)
[Pipeline] checkout
Selected Git installation does not exist. Using Default
The recommended git tool is: NONE
No credentials specified
 > git rev-parse --resolve-git-dir /var/jenkins_home/workspace/java-cicd-clean/.git # timeout=10
Fetching changes from the remote Git repository
 > git config remote.origin.url https://github.com/Vinayvinnu8498/java-cicd-pipeline.git # timeout=10
Fetching upstream changes from https://github.com/Vinayvinnu8498/java-cicd-pipeline.git
 > git --version # timeout=10
 > git --version # 'git version 2.39.5'
 > git fetch --tags --force --progress -- https://github.com/Vinayvinnu8498/java-cicd-pipeline.git +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git rev-parse refs/remotes/origin/main^{commit} # timeout=10
Checking out Revision 814d50053e4e71734d43c7dc6d5b72fc9f141b27 (refs/remotes/origin/main)
 > git config core.sparsecheckout # timeout=10
 > git checkout -f 814d50053e4e71734d43c7dc6d5b72fc9f141b27 # timeout=10
Commit message: "Fix: Corrected Checkout stage to use main branch"
 > git rev-list --no-walk 6b5cdfc0e0ad623549844f3caa9ca986c089ec4f # timeout=10
[Pipeline] }
[Pipeline] // stage
[Pipeline] withEnv
[Pipeline] {
[Pipeline] withCredentials
Masking supported pattern matches of $DOCKER_HUB_CREDENTIALS or $DOCKER_HUB_CREDENTIALS_PSW or $SONAR_TOKEN
[Pipeline] {
[Pipeline] stage
[Pipeline] { (Checkout)
[Pipeline] git
Selected Git installation does not exist. Using Default
The recommended git tool is: NONE
No credentials specified
 > git rev-parse --resolve-git-dir /var/jenkins_home/workspace/java-cicd-clean/.git # timeout=10
Fetching changes from the remote Git repository
 > git config remote.origin.url https://github.com/Vinayvinnu8498/java-cicd-pipeline.git # timeout=10
Fetching upstream changes from https://github.com/Vinayvinnu8498/java-cicd-pipeline.git
 > git --version # timeout=10
 > git --version # 'git version 2.39.5'
 > git fetch --tags --force --progress -- https://github.com/Vinayvinnu8498/java-cicd-pipeline.git +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git rev-parse refs/remotes/origin/main^{commit} # timeout=10
Checking out Revision 814d50053e4e71734d43c7dc6d5b72fc9f141b27 (refs/remotes/origin/main)
 > git config core.sparsecheckout # timeout=10
 > git checkout -f 814d50053e4e71734d43c7dc6d5b72fc9f141b27 # timeout=10
 > git branch -a -v --no-abbrev # timeout=10
 > git branch -D main # timeout=10
 > git checkout -b main 814d50053e4e71734d43c7dc6d5b72fc9f141b27 # timeout=10
Commit message: "Fix: Corrected Checkout stage to use main branch"
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Build)
[Pipeline] node
Running on Jenkins in /var/jenkins_home/workspace/java-cicd-clean@2
[Pipeline] {
[Pipeline] checkout
Selected Git installation does not exist. Using Default
The recommended git tool is: NONE
No credentials specified
 > git rev-parse --resolve-git-dir /var/jenkins_home/workspace/java-cicd-clean@2/.git # timeout=10
Fetching changes from the remote Git repository
 > git config remote.origin.url https://github.com/Vinayvinnu8498/java-cicd-pipeline.git # timeout=10
Fetching upstream changes from https://github.com/Vinayvinnu8498/java-cicd-pipeline.git
 > git --version # timeout=10
 > git --version # 'git version 2.39.5'
 > git fetch --tags --force --progress -- https://github.com/Vinayvinnu8498/java-cicd-pipeline.git +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git rev-parse refs/remotes/origin/main^{commit} # timeout=10
Checking out Revision 814d50053e4e71734d43c7dc6d5b72fc9f141b27 (refs/remotes/origin/main)
 > git config core.sparsecheckout # timeout=10
 > git checkout -f 814d50053e4e71734d43c7dc6d5b72fc9f141b27 # timeout=10
Commit message: "Fix: Corrected Checkout stage to use main branch"
[Pipeline] withEnv
[Pipeline] {
[Pipeline] isUnix
[Pipeline] withEnv
[Pipeline] {
[Pipeline] sh
+ docker inspect -f . maven:3.9-eclipse-temurin-17
.
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] withDockerContainer
Jenkins seems to be running inside container 8b6f8e40e049a6cf1d996df6640be68e21631f0694a035a1c0bf2d36f1fac5c9
$ docker run -t -d -u 1000:1000 -v /root/.m2:/root/.m2 -w /var/jenkins_home/workspace/java-cicd-clean@2 --volumes-from 8b6f8e40e049a6cf1d996df6640be68e21631f0694a035a1c0bf2d36f1fac5c9 -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** maven:3.9-eclipse-temurin-17 cat
$ docker top 719a69651801446bd5ccecbc4263ab8961a4ad7748657040a1c75d8c41834c50 -eo pid,comm
[Pipeline] {
[Pipeline] sh
+ mvn clean package -DskipTests
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------------< com.example:math-utils >-----------------------
[INFO] Building math-utils 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/org/jacoco/jacoco-maven-plugin/0.8.8/jacoco-maven-plugin-0.8.8.pom
Progress (1): 0.7/3.8 kB
Progress (1): 2.1/3.8 kB
Progress (1): 3.4/3.8 kB
Progress (1): 3.8 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jacoco/jacoco-maven-plugin/0.8.8/jacoco-maven-plugin-0.8.8.pom (3.8 kB at 11 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.build/0.8.8/org.jacoco.build-0.8.8.pom
Progress (1): 1.4/44 kB
Progress (1): 2.8/44 kB
Progress (1): 4.1/44 kB
Progress (1): 5.5/44 kB
Progress (1): 6.9/44 kB
Progress (1): 8.3/44 kB
Progress (1): 9.7/44 kB
Progress (1): 11/44 kB 
Progress (1): 12/44 kB
Progress (1): 14/44 kB
Progress (1): 15/44 kB
Progress (1): 17/44 kB
Progress (1): 18/44 kB
Progress (1): 19/44 kB
Progress (1): 21/44 kB
Progress (1): 22/44 kB
Progress (1): 23/44 kB
Progress (1): 25/44 kB
Progress (1): 26/44 kB
Progress (1): 28/44 kB
Progress (1): 29/44 kB
Progress (1): 30/44 kB
Progress (1): 31/44 kB
Progress (1): 33/44 kB
Progress (1): 34/44 kB
Progress (1): 36/44 kB
Progress (1): 37/44 kB
Progress (1): 38/44 kB
Progress (1): 40/44 kB
Progress (1): 41/44 kB
Progress (1): 42/44 kB
Progress (1): 44 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.build/0.8.8/org.jacoco.build-0.8.8.pom (44 kB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jacoco/jacoco-maven-plugin/0.8.8/jacoco-maven-plugin-0.8.8.jar
Progress (1): 16/56 kB
Progress (1): 33/56 kB
Progress (1): 49/56 kB
Progress (1): 56 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/jacoco/jacoco-maven-plugin/0.8.8/jacoco-maven-plugin-0.8.8.jar (56 kB at 2.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.2.0/maven-clean-plugin-3.2.0.pom
Progress (1): 5.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.2.0/maven-clean-plugin-3.2.0.pom (5.3 kB at 231 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/35/maven-plugins-35.pom
Progress (1): 9.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/35/maven-plugins-35.pom (9.9 kB at 495 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/35/maven-parent-35.pom
Progress (1): 16/45 kB
Progress (1): 32/45 kB
Progress (1): 45 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/35/maven-parent-35.pom (45 kB at 2.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/25/apache-25.pom
Progress (1): 16/21 kB
Progress (1): 21 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/25/apache-25.pom (21 kB at 1.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.2.0/maven-clean-plugin-3.2.0.jar
Progress (1): 16/36 kB
Progress (1): 33/36 kB
Progress (1): 36 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.2.0/maven-clean-plugin-3.2.0.jar (36 kB at 1.8 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.3.1/maven-resources-plugin-3.3.1.pom
Progress (1): 8.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.3.1/maven-resources-plugin-3.3.1.pom (8.2 kB at 583 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/39/maven-plugins-39.pom
Progress (1): 8.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/39/maven-plugins-39.pom (8.1 kB at 368 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/39/maven-parent-39.pom
Progress (1): 16/48 kB
Progress (1): 33/48 kB
Progress (1): 48 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/39/maven-parent-39.pom (48 kB at 2.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/29/apache-29.pom
Progress (1): 16/21 kB
Progress (1): 21 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/29/apache-29.pom (21 kB at 829 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.3.1/maven-resources-plugin-3.3.1.jar
Progress (1): 16/31 kB
Progress (1): 31 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.3.1/maven-resources-plugin-3.3.1.jar (31 kB at 860 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.8.1/maven-compiler-plugin-3.8.1.pom
Progress (1): 12 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.8.1/maven-compiler-plugin-3.8.1.pom (12 kB at 624 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/33/maven-plugins-33.pom
Progress (1): 11 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/33/maven-plugins-33.pom (11 kB at 249 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/33/maven-parent-33.pom
Progress (1): 16/44 kB
Progress (1): 32/44 kB
Progress (1): 44 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/33/maven-parent-33.pom (44 kB at 960 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/21/apache-21.pom
Progress (1): 16/17 kB
Progress (1): 17 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/21/apache-21.pom (17 kB at 900 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.8.1/maven-compiler-plugin-3.8.1.jar
Progress (1): 16/62 kB
Progress (1): 33/62 kB
Progress (1): 49/62 kB
Progress (1): 62 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.8.1/maven-compiler-plugin-3.8.1.jar (62 kB at 3.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.22.2/maven-surefire-plugin-2.22.2.pom
Progress (1): 5.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.22.2/maven-surefire-plugin-2.22.2.pom (5.0 kB at 333 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire/2.22.2/surefire-2.22.2.pom
Progress (1): 16/26 kB
Progress (1): 26 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire/2.22.2/surefire-2.22.2.pom (26 kB at 1.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.22.2/maven-surefire-plugin-2.22.2.jar
Progress (1): 16/41 kB
Progress (1): 33/41 kB
Progress (1): 41 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.22.2/maven-surefire-plugin-2.22.2.jar (41 kB at 2.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.4.1/maven-jar-plugin-3.4.1.pom
Progress (1): 7.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.4.1/maven-jar-plugin-3.4.1.pom (7.8 kB at 558 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/42/maven-plugins-42.pom
Progress (1): 7.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/42/maven-plugins-42.pom (7.7 kB at 513 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/42/maven-parent-42.pom
Progress (1): 16/50 kB
Progress (1): 33/50 kB
Progress (1): 49/50 kB
Progress (1): 50 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/42/maven-parent-42.pom (50 kB at 2.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/32/apache-32.pom
Progress (1): 16/24 kB
Progress (1): 24 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/32/apache-32.pom (24 kB at 1.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.2/junit-bom-5.10.2.pom
Progress (1): 5.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.2/junit-bom-5.10.2.pom (5.6 kB at 353 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.4.1/maven-jar-plugin-3.4.1.jar
Progress (1): 16/34 kB
Progress (1): 32/34 kB
Progress (1): 34 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.4.1/maven-jar-plugin-3.4.1.jar (34 kB at 2.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/3.3.0/maven-shade-plugin-3.3.0.pom
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/3.3.0/maven-shade-plugin-3.3.0.pom (13 kB at 685 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/34/maven-plugins-34.pom
Progress (1): 11 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/34/maven-plugins-34.pom (11 kB at 972 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/34/maven-parent-34.pom
Progress (1): 16/43 kB
Progress (1): 33/43 kB
Progress (1): 43 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/34/maven-parent-34.pom (43 kB at 2.9 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/23/apache-23.pom
Progress (1): 16/18 kB
Progress (1): 18 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/23/apache-23.pom (18 kB at 1.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/3.3.0/maven-shade-plugin-3.3.0.jar
Progress (1): 16/141 kB
Progress (1): 33/141 kB
Progress (1): 49/141 kB
Progress (1): 65/141 kB
Progress (1): 81/141 kB
Progress (1): 98/141 kB
Progress (1): 114/141 kB
Progress (1): 131/141 kB
Progress (1): 141 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/3.3.0/maven-shade-plugin-3.3.0.jar (141 kB at 6.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/5.7.0/junit-jupiter-engine-5.7.0.pom
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/5.7.0/junit-jupiter-engine-5.7.0.pom (3.2 kB at 246 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.0/junit-bom-5.7.0.pom
Progress (1): 5.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.0/junit-bom-5.7.0.pom (5.1 kB at 364 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.pom
Progress (1): 1.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.pom (1.2 kB at 117 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.7.0/junit-platform-engine-1.7.0.pom
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.7.0/junit-platform-engine-1.7.0.pom (3.2 kB at 246 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.pom
Progress (1): 1.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.pom (1.7 kB at 140 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.7.0/junit-platform-commons-1.7.0.pom
Progress (1): 2.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.7.0/junit-platform-commons-1.7.0.pom (2.8 kB at 166 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.7.0/junit-jupiter-api-5.7.0.pom
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.7.0/junit-jupiter-api-5.7.0.pom (3.2 kB at 159 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/5.7.0/junit-jupiter-engine-5.7.0.jar
Progress (1): 16/212 kB
Progress (1): 33/212 kB
Progress (1): 49/212 kB
Progress (1): 64/212 kB
Progress (1): 81/212 kB
Progress (1): 97/212 kB
Progress (1): 114/212 kB
Progress (1): 130/212 kB
Progress (1): 146/212 kB
Progress (1): 163/212 kB
Progress (1): 179/212 kB
Progress (1): 196/212 kB
Progress (1): 212 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/5.7.0/junit-jupiter-engine-5.7.0.jar (212 kB at 6.8 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.7.0/junit-platform-engine-1.7.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.7.0/junit-platform-commons-1.7.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.7.0/junit-jupiter-api-5.7.0.jar
Progress (1): 2.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.jar (2.4 kB at 184 kB/s)
Progress (1): 1.4/100 kB
Progress (1): 2.8/100 kB
Progress (1): 4.1/100 kB
Progress (1): 5.5/100 kB
Progress (1): 6.9/100 kB
Progress (1): 8.3/100 kB
Progress (1): 9.7/100 kB
Progress (1): 11/100 kB 
Progress (1): 12/100 kB
Progress (1): 14/100 kB
Progress (2): 14/100 kB | 1.4/175 kB
Progress (2): 14/100 kB | 2.8/175 kB
Progress (2): 14/100 kB | 4.1/175 kB
Progress (2): 14/100 kB | 5.5/175 kB
Progress (2): 14/100 kB | 6.9/175 kB
Progress (2): 14/100 kB | 8.3/175 kB
Progress (2): 14/100 kB | 9.7/175 kB
Progress (2): 14/100 kB | 11/175 kB 
Progress (2): 14/100 kB | 12/175 kB
Progress (2): 14/100 kB | 14/175 kB
Progress (2): 15/100 kB | 14/175 kB
Progress (2): 16/100 kB | 14/175 kB
Progress (2): 16/100 kB | 15/175 kB
Progress (2): 16/100 kB | 17/175 kB
Progress (2): 16/100 kB | 18/175 kB
Progress (2): 16/100 kB | 19/175 kB
Progress (2): 16/100 kB | 21/175 kB
Progress (2): 16/100 kB | 22/175 kB
Progress (2): 16/100 kB | 23/175 kB
Progress (2): 16/100 kB | 25/175 kB
Progress (2): 16/100 kB | 26/175 kB
Progress (2): 16/100 kB | 28/175 kB
Progress (2): 33/100 kB | 28/175 kB
Progress (2): 33/100 kB | 29/175 kB
Progress (2): 33/100 kB | 30/175 kB
Progress (2): 33/100 kB | 32/175 kB
Progress (2): 33/100 kB | 33/175 kB
Progress (2): 33/100 kB | 34/175 kB
Progress (2): 33/100 kB | 36/175 kB
Progress (2): 33/100 kB | 37/175 kB
Progress (2): 33/100 kB | 38/175 kB
Progress (2): 33/100 kB | 40/175 kB
Progress (2): 33/100 kB | 41/175 kB
Progress (2): 49/100 kB | 41/175 kB
Progress (2): 49/100 kB | 42/175 kB
Progress (2): 49/100 kB | 44/175 kB
Progress (2): 49/100 kB | 45/175 kB
Progress (2): 49/100 kB | 47/175 kB
Progress (2): 49/100 kB | 48/175 kB
Progress (2): 49/100 kB | 49/175 kB
Progress (2): 49/100 kB | 51/175 kB
Progress (2): 49/100 kB | 52/175 kB
Progress (2): 49/100 kB | 53/175 kB
Progress (2): 49/100 kB | 55/175 kB
Progress (2): 49/100 kB | 56/175 kB
Progress (2): 49/100 kB | 58/175 kB
Progress (3): 49/100 kB | 58/175 kB | 1.4/7.7 kB
Progress (3): 49/100 kB | 58/175 kB | 2.8/7.7 kB
Progress (3): 49/100 kB | 58/175 kB | 4.1/7.7 kB
Progress (3): 49/100 kB | 58/175 kB | 5.5/7.7 kB
Progress (3): 49/100 kB | 59/175 kB | 5.5/7.7 kB
Progress (3): 49/100 kB | 59/175 kB | 6.9/7.7 kB
Progress (3): 49/100 kB | 59/175 kB | 7.7 kB    
Progress (3): 49/100 kB | 60/175 kB | 7.7 kB
Progress (3): 49/100 kB | 62/175 kB | 7.7 kB
Progress (3): 49/100 kB | 63/175 kB | 7.7 kB
Progress (3): 49/100 kB | 64/175 kB | 7.7 kB
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar (7.7 kB at 109 kB/s)
Progress (2): 49/100 kB | 65/175 kB
Progress (2): 49/100 kB | 81/175 kB
Progress (2): 66/100 kB | 81/175 kB
Progress (2): 66/100 kB | 98/175 kB
Progress (2): 66/100 kB | 114/175 kB
Progress (2): 66/100 kB | 130/175 kB
Progress (2): 66/100 kB | 147/175 kB
Progress (2): 66/100 kB | 163/175 kB
Progress (2): 66/100 kB | 175 kB    
                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.7.0/junit-jupiter-api-5.7.0.jar (175 kB at 1.9 MB/s)
Progress (1): 82/100 kB
Progress (1): 98/100 kB
Progress (1): 100 kB   
Progress (2): 100 kB | 16/181 kB
                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.7.0/junit-platform-commons-1.7.0.jar (100 kB at 1.0 MB/s)
Progress (1): 33/181 kB
Progress (1): 49/181 kB
Progress (1): 66/181 kB
Progress (1): 82/181 kB
Progress (1): 98/181 kB
Progress (1): 115/181 kB
Progress (1): 131/181 kB
Progress (1): 147/181 kB
Progress (1): 164/181 kB
Progress (1): 180/181 kB
Progress (1): 181 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.7.0/junit-platform-engine-1.7.0.jar (181 kB at 1.6 MB/s)
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ math-utils ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.3.4/maven-shared-utils-3.3.4.pom
Progress (1): 5.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.3.4/maven-shared-utils-3.3.4.pom (5.8 kB at 486 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/34/maven-shared-components-34.pom
Progress (1): 5.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/34/maven-shared-components-34.pom (5.1 kB at 283 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.6/commons-io-2.6.pom
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.6/commons-io-2.6.pom (14 kB at 1.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/42/commons-parent-42.pom
Progress (1): 16/68 kB
Progress (1): 33/68 kB
Progress (1): 49/68 kB
Progress (1): 66/68 kB
Progress (1): 68 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/42/commons-parent-42.pom (68 kB at 3.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/18/apache-18.pom
Progress (1): 16 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/18/apache-18.pom (16 kB at 979 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.3.4/maven-shared-utils-3.3.4.jar
Progress (1): 16/153 kB
Progress (1): 33/153 kB
Progress (1): 49/153 kB
Progress (1): 65/153 kB
Progress (1): 82/153 kB
Progress (1): 98/153 kB
Progress (1): 115/153 kB
Progress (1): 131/153 kB
Progress (1): 147/153 kB
Progress (1): 153 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.3.4/maven-shared-utils-3.3.4.jar (153 kB at 2.6 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.6/commons-io-2.6.jar
Progress (1): 16/215 kB
Progress (1): 33/215 kB
Progress (1): 49/215 kB
Progress (1): 62/215 kB
Progress (1): 78/215 kB
Progress (1): 95/215 kB
Progress (1): 111/215 kB
Progress (1): 127/215 kB
Progress (1): 144/215 kB
Progress (1): 160/215 kB
Progress (1): 177/215 kB
Progress (1): 193/215 kB
Progress (1): 209/215 kB
Progress (1): 215 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.6/commons-io-2.6.jar (215 kB at 5.4 MB/s)
[INFO] Deleting /var/jenkins_home/workspace/java-cicd-clean@2/target
[INFO] 
[INFO] --- jacoco:0.8.8:prepare-agent (default) @ math-utils ---
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.22/plexus-utils-3.0.22.pom
Progress (1): 3.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.22/plexus-utils-3.0.22.pom (3.8 kB at 225 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.3.1/plexus-3.3.1.pom
Progress (1): 16/20 kB
Progress (1): 20 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.3.1/plexus-3.3.1.pom (20 kB at 818 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/17/spice-parent-17.pom
Progress (1): 6.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/17/spice-parent-17.pom (6.8 kB at 398 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/10/forge-parent-10.pom
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/10/forge-parent-10.pom (14 kB at 565 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/1.2.1/file-management-1.2.1.pom
Progress (1): 3.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/1.2.1/file-management-1.2.1.pom (3.9 kB at 259 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/10/maven-shared-components-10.pom
Progress (1): 8.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/10/maven-shared-components-10.pom (8.4 kB at 602 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/9/maven-parent-9.pom
Progress (1): 16/33 kB
Progress (1): 32/33 kB
Progress (1): 33 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/9/maven-parent-9.pom (33 kB at 2.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/4/apache-4.pom
Progress (1): 4.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/4/apache-4.pom (4.5 kB at 409 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.6/maven-plugin-api-2.0.6.pom
Progress (1): 1.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.6/maven-plugin-api-2.0.6.pom (1.5 kB at 132 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.0.6/maven-2.0.6.pom
Progress (1): 9.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.0.6/maven-2.0.6.pom (9.0 kB at 754 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/5/maven-parent-5.pom
Progress (1): 15 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/5/maven-parent-5.pom (15 kB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/3/apache-3.pom
Progress (1): 3.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/3/apache-3.pom (3.4 kB at 286 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-io/1.1/maven-shared-io-1.1.pom
Progress (1): 4.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-io/1.1/maven-shared-io-1.1.pom (4.1 kB at 271 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/8/maven-shared-components-8.pom
Progress (1): 2.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/8/maven-shared-components-8.pom (2.7 kB at 191 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/7/maven-parent-7.pom
Progress (1): 16/21 kB
Progress (1): 21 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/7/maven-parent-7.pom (21 kB at 1.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.2/maven-artifact-2.0.2.pom
Progress (1): 765 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.2/maven-artifact-2.0.2.pom (765 B at 59 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.0.2/maven-2.0.2.pom
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.0.2/maven-2.0.2.pom (13 kB at 1.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.1/plexus-utils-1.1.pom
Progress (1): 767 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.1/plexus-utils-1.1.pom (767 B at 77 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.4/plexus-1.0.4.pom
Progress (1): 5.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.4/plexus-1.0.4.pom (5.7 kB at 478 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.0.2/maven-artifact-manager-2.0.2.pom
Progress (1): 1.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.0.2/maven-artifact-manager-2.0.2.pom (1.4 kB at 107 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.2/maven-repository-metadata-2.0.2.pom
Progress (1): 1.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.2/maven-repository-metadata-2.0.2.pom (1.3 kB at 87 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9/plexus-container-default-1.0-alpha-9.pom
Progress (1): 1.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9/plexus-container-default-1.0-alpha-9.pom (1.2 kB at 103 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.0.3/plexus-containers-1.0.3.pom
Progress (1): 492 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.0.3/plexus-containers-1.0.3.pom (492 B at 31 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/junit/junit/4.13.1/junit-4.13.1.pom
Progress (1): 16/25 kB
Progress (1): 25 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/junit/junit/4.13.1/junit-4.13.1.pom (25 kB at 1.9 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.pom
Progress (1): 766 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.pom (766 B at 51 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-parent/1.3/hamcrest-parent-1.3.pom
Progress (1): 2.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-parent/1.3/hamcrest-parent-1.3.pom (2.0 kB at 131 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.0.4/plexus-utils-1.0.4.pom
Progress (1): 6.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.0.4/plexus-utils-1.0.4.pom (6.9 kB at 527 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1-alpha-2/classworlds-1.1-alpha-2.pom
Progress (1): 3.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1-alpha-2/classworlds-1.1-alpha-2.pom (3.1 kB at 261 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/1.0-alpha-6/wagon-provider-api-1.0-alpha-6.pom
Progress (1): 588 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/1.0-alpha-6/wagon-provider-api-1.0-alpha-6.pom (588 B at 45 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon/1.0-alpha-6/wagon-1.0-alpha-6.pom
Progress (1): 6.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon/1.0-alpha-6/wagon-1.0-alpha-6.pom (6.4 kB at 427 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.4.6/plexus-utils-1.4.6.pom
Progress (1): 2.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.4.6/plexus-utils-1.4.6.pom (2.3 kB at 174 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.11/plexus-1.0.11.pom
Progress (1): 9.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.11/plexus-1.0.11.pom (9.0 kB at 690 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.6/plexus-utils-1.5.6.pom
Progress (1): 5.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.6/plexus-utils-1.5.6.pom (5.3 kB at 442 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.12/plexus-1.0.12.pom
Progress (1): 9.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.12/plexus-1.0.12.pom (9.8 kB at 754 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.pom
Progress (1): 2.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.pom (2.4 kB at 216 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/15/maven-shared-components-15.pom
Progress (1): 9.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/15/maven-shared-components-15.pom (9.3 kB at 584 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/16/maven-parent-16.pom
Progress (1): 16/23 kB
Progress (1): 23 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/16/maven-parent-16.pom (23 kB at 1.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/7/apache-7.pom
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/7/apache-7.pom (14 kB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.0/doxia-sink-api-1.0.pom
Progress (1): 1.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.0/doxia-sink-api-1.0.pom (1.4 kB at 92 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.0/doxia-1.0.pom
Progress (1): 9.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.0/doxia-1.0.pom (9.6 kB at 742 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/10/maven-parent-10.pom
Progress (1): 16/32 kB
Progress (1): 32 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/10/maven-parent-10.pom (32 kB at 2.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.agent/0.8.8/org.jacoco.agent-0.8.8.pom
Progress (1): 3.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.agent/0.8.8/org.jacoco.agent-0.8.8.pom (3.5 kB at 292 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.core/0.8.8/org.jacoco.core-0.8.8.pom
Progress (1): 2.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.core/0.8.8/org.jacoco.core-0.8.8.pom (2.1 kB at 149 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.2/asm-9.2.pom
Progress (1): 2.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.2/asm-9.2.pom (2.4 kB at 169 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/ow2/1.5/ow2-1.5.pom
Progress (1): 11 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/ow2/1.5/ow2-1.5.pom (11 kB at 936 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.2/asm-commons-9.2.pom
Progress (1): 3.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.2/asm-commons-9.2.pom (3.0 kB at 247 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.2/asm-tree-9.2.pom
Progress (1): 2.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.2/asm-tree-9.2.pom (2.6 kB at 173 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-analysis/9.2/asm-analysis-9.2.pom
Progress (1): 2.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-analysis/9.2/asm-analysis-9.2.pom (2.6 kB at 238 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.report/0.8.8/org.jacoco.report-0.8.8.pom
Progress (1): 1.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.report/0.8.8/org.jacoco.report-0.8.8.pom (1.9 kB at 134 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.22/plexus-utils-3.0.22.jar
Progress (1): 16/245 kB
Progress (1): 33/245 kB
Progress (1): 49/245 kB
Progress (1): 65/245 kB
Progress (1): 81/245 kB
Progress (1): 98/245 kB
Progress (1): 114/245 kB
Progress (1): 131/245 kB
Progress (1): 147/245 kB
Progress (1): 163/245 kB
Progress (1): 180/245 kB
Progress (1): 196/245 kB
Progress (1): 212/245 kB
Progress (1): 229/245 kB
Progress (1): 245 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.22/plexus-utils-3.0.22.jar (245 kB at 7.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/1.2.1/file-management-1.2.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.6/maven-plugin-api-2.0.6.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-io/1.1/maven-shared-io-1.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.2/maven-artifact-2.0.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.0.2/maven-artifact-manager-2.0.2.jar
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.6/maven-plugin-api-2.0.6.jar (13 kB at 756 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.2/maven-repository-metadata-2.0.2.jar
Progress (1): 16/49 kB
Progress (2): 16/49 kB | 1.4/78 kB
Progress (2): 33/49 kB | 1.4/78 kB
Progress (3): 33/49 kB | 1.4/78 kB | 16/38 kB
Progress (3): 33/49 kB | 2.8/78 kB | 16/38 kB
Progress (3): 33/49 kB | 4.1/78 kB | 16/38 kB
Progress (3): 33/49 kB | 5.5/78 kB | 16/38 kB
Progress (3): 33/49 kB | 6.9/78 kB | 16/38 kB
Progress (3): 33/49 kB | 8.3/78 kB | 16/38 kB
Progress (3): 33/49 kB | 9.7/78 kB | 16/38 kB
Progress (3): 33/49 kB | 11/78 kB | 16/38 kB 
Progress (3): 33/49 kB | 12/78 kB | 16/38 kB
Progress (3): 33/49 kB | 14/78 kB | 16/38 kB
Progress (3): 33/49 kB | 15/78 kB | 16/38 kB
Progress (3): 33/49 kB | 15/78 kB | 32/38 kB
Progress (3): 33/49 kB | 15/78 kB | 38 kB   
Progress (3): 33/49 kB | 17/78 kB | 38 kB
Progress (3): 33/49 kB | 18/78 kB | 38 kB
Progress (3): 33/49 kB | 19/78 kB | 38 kB
Progress (3): 49/49 kB | 19/78 kB | 38 kB
Progress (3): 49 kB | 19/78 kB | 38 kB   
                                      
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/1.2.1/file-management-1.2.1.jar (38 kB at 1.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/1.0-alpha-6/wagon-provider-api-1.0-alpha-6.jar
Progress (2): 49 kB | 21/78 kB
Progress (2): 49 kB | 22/78 kB
                              
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.0.2/maven-artifact-manager-2.0.2.jar (49 kB at 1.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9/plexus-container-default-1.0-alpha-9.jar
Progress (1): 23/78 kB
Progress (2): 23/78 kB | 16/39 kB
Progress (2): 25/78 kB | 16/39 kB
Progress (2): 26/78 kB | 16/39 kB
Progress (2): 28/78 kB | 16/39 kB
Progress (2): 29/78 kB | 16/39 kB
Progress (2): 30/78 kB | 16/39 kB
Progress (2): 32/78 kB | 16/39 kB
Progress (3): 32/78 kB | 16/39 kB | 16/20 kB
Progress (3): 33/78 kB | 16/39 kB | 16/20 kB
Progress (3): 33/78 kB | 16/39 kB | 20 kB   
                                         
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.2/maven-repository-metadata-2.0.2.jar (20 kB at 410 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/junit/junit/4.13.1/junit-4.13.1.jar
Progress (2): 33/78 kB | 33/39 kB
Progress (2): 33/78 kB | 39 kB   
                              
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-io/1.1/maven-shared-io-1.1.jar (39 kB at 731 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar
Progress (1): 49/78 kB
Progress (2): 49/78 kB | 16/43 kB
Progress (2): 49/78 kB | 33/43 kB
Progress (2): 66/78 kB | 33/43 kB
Progress (2): 78 kB | 33/43 kB   
Progress (2): 78 kB | 43 kB   
                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.2/maven-artifact-2.0.2.jar (78 kB at 1.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1-alpha-2/classworlds-1.1-alpha-2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/1.0-alpha-6/wagon-provider-api-1.0-alpha-6.jar (43 kB at 712 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.jar
Progress (1): 16/195 kB
Progress (1): 32/195 kB
Progress (1): 49/195 kB
Progress (1): 65/195 kB
Progress (2): 65/195 kB | 16/383 kB
Progress (2): 65/195 kB | 33/383 kB
Progress (2): 65/195 kB | 49/383 kB
Progress (2): 65/195 kB | 66/383 kB
Progress (2): 80/195 kB | 66/383 kB
Progress (2): 80/195 kB | 82/383 kB
Progress (2): 80/195 kB | 98/383 kB
Progress (2): 80/195 kB | 111/383 kB
Progress (2): 80/195 kB | 128/383 kB
Progress (2): 80/195 kB | 144/383 kB
Progress (2): 80/195 kB | 160/383 kB
Progress (2): 80/195 kB | 177/383 kB
Progress (2): 80/195 kB | 193/383 kB
Progress (2): 97/195 kB | 193/383 kB
Progress (2): 113/195 kB | 193/383 kB
Progress (3): 113/195 kB | 193/383 kB | 11 kB
Progress (4): 113/195 kB | 193/383 kB | 11 kB | 16/45 kB
                                                        
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.jar (11 kB at 108 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.0/doxia-sink-api-1.0.jar
Progress (3): 130/195 kB | 193/383 kB | 16/45 kB
Progress (3): 146/195 kB | 193/383 kB | 16/45 kB
Progress (3): 162/195 kB | 193/383 kB | 16/45 kB
Progress (3): 179/195 kB | 193/383 kB | 16/45 kB
Progress (3): 195/195 kB | 193/383 kB | 16/45 kB
Progress (3): 195/195 kB | 193/383 kB | 32/45 kB
Progress (3): 195 kB | 193/383 kB | 32/45 kB    
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9/plexus-container-default-1.0-alpha-9.jar (195 kB at 1.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.agent/0.8.8/org.jacoco.agent-0.8.8-runtime.jar
Progress (2): 193/383 kB | 45 kB
Progress (2): 209/383 kB | 45 kB
                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar (45 kB at 388 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.core/0.8.8/org.jacoco.core-0.8.8.jar
Progress (1): 226/383 kB
Progress (2): 226/383 kB | 10 kB
Progress (3): 226/383 kB | 10 kB | 16/38 kB
                                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.0/doxia-sink-api-1.0.jar (10 kB at 83 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.2/asm-9.2.jar
Progress (2): 242/383 kB | 16/38 kB
Progress (2): 242/383 kB | 33/38 kB
Progress (2): 242/383 kB | 38 kB   
                                
Downloaded from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1-alpha-2/classworlds-1.1-alpha-2.jar (38 kB at 298 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.2/asm-commons-9.2.jar
Progress (1): 259/383 kB
Progress (1): 275/383 kB
Progress (1): 291/383 kB
Progress (1): 308/383 kB
Progress (2): 308/383 kB | 16/203 kB
Progress (3): 308/383 kB | 16/203 kB | 16/293 kB
Progress (3): 324/383 kB | 16/203 kB | 16/293 kB
Progress (3): 324/383 kB | 16/203 kB | 18/293 kB
Progress (3): 324/383 kB | 16/203 kB | 34/293 kB
Progress (3): 324/383 kB | 16/203 kB | 40/293 kB
Progress (3): 324/383 kB | 16/203 kB | 56/293 kB
Progress (3): 324/383 kB | 16/203 kB | 60/293 kB
Progress (3): 324/383 kB | 16/203 kB | 77/293 kB
Progress (3): 324/383 kB | 16/203 kB | 81/293 kB
Progress (3): 324/383 kB | 16/203 kB | 97/293 kB
Progress (3): 324/383 kB | 16/203 kB | 113/293 kB
Progress (4): 324/383 kB | 16/203 kB | 113/293 kB | 16/122 kB
Progress (4): 324/383 kB | 16/203 kB | 130/293 kB | 16/122 kB
Progress (4): 324/383 kB | 16/203 kB | 146/293 kB | 16/122 kB
Progress (4): 324/383 kB | 16/203 kB | 162/293 kB | 16/122 kB
Progress (4): 324/383 kB | 16/203 kB | 179/293 kB | 16/122 kB
Progress (4): 324/383 kB | 33/203 kB | 179/293 kB | 16/122 kB
Progress (4): 324/383 kB | 33/203 kB | 195/293 kB | 16/122 kB
Progress (4): 324/383 kB | 33/203 kB | 212/293 kB | 16/122 kB
Progress (4): 341/383 kB | 33/203 kB | 212/293 kB | 16/122 kB
Progress (4): 341/383 kB | 33/203 kB | 228/293 kB | 16/122 kB
Progress (4): 341/383 kB | 33/203 kB | 244/293 kB | 16/122 kB
Progress (4): 341/383 kB | 33/203 kB | 261/293 kB | 16/122 kB
Progress (4): 341/383 kB | 33/203 kB | 277/293 kB | 16/122 kB
Progress (4): 341/383 kB | 33/203 kB | 293 kB | 16/122 kB    
                                                         
Downloaded from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.agent/0.8.8/org.jacoco.agent-0.8.8-runtime.jar (293 kB at 1.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-analysis/9.2/asm-analysis-9.2.jar
Progress (4): 341/383 kB | 33/203 kB | 16/122 kB | 16/73 kB
Progress (4): 341/383 kB | 49/203 kB | 16/122 kB | 16/73 kB
Progress (4): 341/383 kB | 49/203 kB | 16/122 kB | 32/73 kB
Progress (4): 341/383 kB | 61/203 kB | 16/122 kB | 32/73 kB
Progress (4): 341/383 kB | 78/203 kB | 16/122 kB | 32/73 kB
Progress (4): 341/383 kB | 78/203 kB | 33/122 kB | 32/73 kB
Progress (4): 357/383 kB | 78/203 kB | 33/122 kB | 32/73 kB
Progress (4): 357/383 kB | 78/203 kB | 33/122 kB | 49/73 kB
Progress (4): 357/383 kB | 78/203 kB | 49/122 kB | 49/73 kB
Progress (4): 357/383 kB | 78/203 kB | 66/122 kB | 49/73 kB
Progress (4): 357/383 kB | 78/203 kB | 82/122 kB | 49/73 kB
Progress (4): 357/383 kB | 78/203 kB | 82/122 kB | 65/73 kB
Progress (4): 357/383 kB | 78/203 kB | 82/122 kB | 73 kB   
                                                        
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.2/asm-commons-9.2.jar (73 kB at 329 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.2/asm-tree-9.2.jar
Progress (3): 357/383 kB | 78/203 kB | 98/122 kB
Progress (3): 357/383 kB | 78/203 kB | 115/122 kB
Progress (3): 357/383 kB | 94/203 kB | 115/122 kB
Progress (3): 373/383 kB | 94/203 kB | 115/122 kB
Progress (3): 373/383 kB | 94/203 kB | 122 kB    
                                             
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.2/asm-9.2.jar (122 kB at 537 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.report/0.8.8/org.jacoco.report-0.8.8.jar
Progress (2): 383 kB | 94/203 kB
Progress (2): 383 kB | 111/203 kB
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/junit/junit/4.13.1/junit-4.13.1.jar (383 kB at 1.6 MB/s)
Progress (1): 127/203 kB
Progress (1): 143/203 kB
Progress (2): 143/203 kB | 16/34 kB
Progress (2): 143/203 kB | 33/34 kB
Progress (2): 143/203 kB | 34 kB   
Progress (2): 160/203 kB | 34 kB
                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-analysis/9.2/asm-analysis-9.2.jar (34 kB at 140 kB/s)
Progress (1): 176/203 kB
Progress (1): 193/203 kB
Progress (1): 203 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.core/0.8.8/org.jacoco.core-0.8.8.jar (203 kB at 788 kB/s)
Progress (1): 16/53 kB
Progress (1): 32/53 kB
Progress (1): 49/53 kB
Progress (1): 53 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.2/asm-tree-9.2.jar (53 kB at 194 kB/s)
Progress (1): 16/129 kB
Progress (1): 33/129 kB
Progress (1): 49/129 kB
Progress (1): 66/129 kB
Progress (1): 82/129 kB
Progress (1): 98/129 kB
Progress (1): 115/129 kB
Progress (1): 129 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.report/0.8.8/org.jacoco.report-0.8.8.jar (129 kB at 455 kB/s)
[INFO] argLine set to -javaagent:/home/ubuntu/.m2/repository/org/jacoco/org.jacoco.agent/0.8.8/org.jacoco.agent-0.8.8-runtime.jar=destfile=/var/jenkins_home/workspace/java-cicd-clean@2/target/jacoco.exec
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ math-utils ---
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.pom
Progress (1): 2.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.pom (2.7 kB at 190 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/5.1/plexus-5.1.pom
Progress (1): 16/23 kB
Progress (1): 23 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/5.1/plexus-5.1.pom (23 kB at 1.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.pom
Progress (1): 8.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.pom (8.8 kB at 461 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/10/plexus-10.pom
Progress (1): 16/25 kB
Progress (1): 25 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/10/plexus-10.pom (25 kB at 1.6 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.3.1/maven-filtering-3.3.1.pom
Progress (1): 6.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.3.1/maven-filtering-3.3.1.pom (6.0 kB at 549 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/39/maven-shared-components-39.pom
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/39/maven-shared-components-39.pom (3.2 kB at 201 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.pom
Progress (1): 612 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.pom (612 B at 56 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.pom
Progress (1): 2.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.pom (2.7 kB at 171 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.36/slf4j-parent-1.7.36.pom
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.36/slf4j-parent-1.7.36.pom (14 kB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.pom
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.pom (3.2 kB at 169 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/15/spice-parent-15.pom
Progress (1): 8.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/15/spice-parent-15.pom (8.4 kB at 492 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/5/forge-parent-5.pom
Progress (1): 8.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/5/forge-parent-5.pom (8.4 kB at 836 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.0/plexus-utils-3.5.0.pom
Progress (1): 8.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.0/plexus-utils-3.5.0.pom (8.0 kB at 501 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.pom
Progress (1): 16/20 kB
Progress (1): 20 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.pom (20 kB at 1.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/52/commons-parent-52.pom
Progress (1): 16/79 kB
Progress (1): 33/79 kB
Progress (1): 49/79 kB
Progress (1): 66/79 kB
Progress (1): 79 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/52/commons-parent-52.pom (79 kB at 5.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.2/junit-bom-5.7.2.pom
Progress (1): 5.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.2/junit-bom-5.7.2.pom (5.1 kB at 255 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.pom
Progress (1): 16/31 kB
Progress (1): 31 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.pom (31 kB at 1.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.1/junit-bom-5.7.1.pom
Progress (1): 5.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.1/junit-bom-5.7.1.pom (5.1 kB at 340 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.jar
Progress (1): 16/85 kB
Progress (1): 33/85 kB
Progress (1): 49/85 kB
Progress (1): 66/85 kB
Progress (1): 82/85 kB
Progress (1): 85 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.jar (85 kB at 2.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.3.1/maven-filtering-3.3.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.jar
Progress (1): 8.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.jar (8.5 kB at 424 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.jar
Progress (1): 16/269 kB
Progress (2): 16/269 kB | 2.5 kB
                                
Downloaded from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar (2.5 kB at 76 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.jar
Progress (1): 33/269 kB
Progress (2): 33/269 kB | 16/41 kB
Progress (2): 33/269 kB | 33/41 kB
Progress (3): 33/269 kB | 33/41 kB | 16/55 kB
Progress (4): 33/269 kB | 33/41 kB | 16/55 kB | 16/327 kB
Progress (4): 49/269 kB | 33/41 kB | 16/55 kB | 16/327 kB
Progress (4): 49/269 kB | 33/41 kB | 16/55 kB | 33/327 kB
Progress (4): 49/269 kB | 33/41 kB | 33/55 kB | 33/327 kB
Progress (4): 63/269 kB | 33/41 kB | 33/55 kB | 33/327 kB
Progress (4): 79/269 kB | 33/41 kB | 33/55 kB | 33/327 kB
Progress (4): 96/269 kB | 33/41 kB | 33/55 kB | 33/327 kB
Progress (4): 112/269 kB | 33/41 kB | 33/55 kB | 33/327 kB
Progress (4): 128/269 kB | 33/41 kB | 33/55 kB | 33/327 kB
Progress (4): 145/269 kB | 33/41 kB | 33/55 kB | 33/327 kB
Progress (4): 161/269 kB | 33/41 kB | 33/55 kB | 33/327 kB
Progress (4): 161/269 kB | 33/41 kB | 33/55 kB | 49/327 kB
Progress (4): 161/269 kB | 33/41 kB | 49/55 kB | 49/327 kB
Progress (5): 161/269 kB | 33/41 kB | 49/55 kB | 49/327 kB | 16/587 kB
Progress (5): 161/269 kB | 33/41 kB | 55 kB | 49/327 kB | 16/587 kB   
                                                                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.3.1/maven-filtering-3.3.1.jar (55 kB at 611 kB/s)
Progress (4): 161/269 kB | 41 kB | 49/327 kB | 16/587 kB
                                                        
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar (41 kB at 392 kB/s)
Progress (3): 161/269 kB | 64/327 kB | 16/587 kB
Progress (3): 161/269 kB | 81/327 kB | 16/587 kB
Progress (3): 161/269 kB | 97/327 kB | 16/587 kB
Progress (3): 177/269 kB | 97/327 kB | 16/587 kB
Progress (3): 177/269 kB | 97/327 kB | 33/587 kB
Progress (3): 194/269 kB | 97/327 kB | 33/587 kB
Progress (3): 194/269 kB | 97/327 kB | 49/587 kB
Progress (3): 194/269 kB | 97/327 kB | 61/587 kB
Progress (3): 210/269 kB | 97/327 kB | 61/587 kB
Progress (3): 227/269 kB | 97/327 kB | 61/587 kB
Progress (3): 227/269 kB | 97/327 kB | 78/587 kB
Progress (3): 227/269 kB | 113/327 kB | 78/587 kB
Progress (3): 243/269 kB | 113/327 kB | 78/587 kB
Progress (3): 243/269 kB | 130/327 kB | 78/587 kB
Progress (3): 243/269 kB | 130/327 kB | 94/587 kB
Progress (3): 259/269 kB | 130/327 kB | 94/587 kB
Progress (3): 259/269 kB | 130/327 kB | 111/587 kB
Progress (3): 259/269 kB | 130/327 kB | 127/587 kB
Progress (3): 269 kB | 130/327 kB | 127/587 kB    
                                              
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.jar (269 kB at 1.7 MB/s)
Progress (2): 146/327 kB | 127/587 kB
Progress (2): 163/327 kB | 127/587 kB
Progress (2): 179/327 kB | 127/587 kB
Progress (2): 179/327 kB | 143/587 kB
Progress (2): 179/327 kB | 160/587 kB
Progress (2): 195/327 kB | 160/587 kB
Progress (2): 212/327 kB | 160/587 kB
Progress (2): 228/327 kB | 160/587 kB
Progress (2): 245/327 kB | 160/587 kB
Progress (2): 261/327 kB | 160/587 kB
Progress (2): 277/327 kB | 160/587 kB
Progress (2): 294/327 kB | 160/587 kB
Progress (2): 310/327 kB | 160/587 kB
Progress (2): 326/327 kB | 160/587 kB
Progress (2): 327 kB | 160/587 kB    
Progress (2): 327 kB | 176/587 kB
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.jar (327 kB at 1.7 MB/s)
Progress (1): 193/587 kB
Progress (1): 209/587 kB
Progress (1): 225/587 kB
Progress (1): 242/587 kB
Progress (1): 258/587 kB
Progress (1): 274/587 kB
Progress (1): 291/587 kB
Progress (1): 307/587 kB
Progress (1): 324/587 kB
Progress (1): 340/587 kB
Progress (1): 356/587 kB
Progress (1): 373/587 kB
Progress (1): 389/587 kB
Progress (1): 406/587 kB
Progress (1): 422/587 kB
Progress (1): 438/587 kB
Progress (1): 455/587 kB
Progress (1): 471/587 kB
Progress (1): 487/587 kB
Progress (1): 504/587 kB
Progress (1): 520/587 kB
Progress (1): 537/587 kB
Progress (1): 553/587 kB
Progress (1): 569/587 kB
Progress (1): 586/587 kB
Progress (1): 587 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.jar (587 kB at 2.5 MB/s)
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /var/jenkins_home/workspace/java-cicd-clean@2/src/main/resources
[INFO] 
[INFO] --- compiler:3.8.1:compile (default-compile) @ math-utils ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.pom
Progress (1): 2.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.pom (2.3 kB at 120 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.0/maven-3.0.pom
Progress (1): 16/22 kB
Progress (1): 22 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.0/maven-3.0.pom (22 kB at 842 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/15/maven-parent-15.pom
Progress (1): 16/24 kB
Progress (1): 24 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/15/maven-parent-15.pom (24 kB at 1.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/6/apache-6.pom
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/6/apache-6.pom (13 kB at 753 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.pom
Progress (1): 3.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.pom (3.9 kB at 299 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.4/plexus-utils-2.0.4.pom
Progress (1): 3.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.4/plexus-utils-2.0.4.pom (3.3 kB at 278 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.6/plexus-2.0.6.pom
Progress (1): 16/17 kB
Progress (1): 17 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.6/plexus-2.0.6.pom (17 kB at 1.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.pom
Progress (1): 1.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.pom (1.9 kB at 120 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.pom
Progress (1): 5.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.pom (5.4 kB at 283 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-plexus/1.4.2/guice-plexus-1.4.2.pom
Progress (1): 3.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-plexus/1.4.2/guice-plexus-1.4.2.pom (3.1 kB at 209 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-bean/1.4.2/guice-bean-1.4.2.pom
Progress (1): 2.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-bean/1.4.2/guice-bean-1.4.2.pom (2.6 kB at 217 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject/1.4.2/sisu-inject-1.4.2.pom
Progress (1): 1.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject/1.4.2/sisu-inject-1.4.2.pom (1.2 kB at 89 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-parent/1.4.2/sisu-parent-1.4.2.pom
Progress (1): 7.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-parent/1.4.2/sisu-parent-1.4.2.pom (7.8 kB at 598 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/6/forge-parent-6.pom
Progress (1): 11 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/6/forge-parent-6.pom (11 kB at 489 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.7.1/plexus-component-annotations-1.7.1.pom
Progress (1): 770 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.7.1/plexus-component-annotations-1.7.1.pom (770 B at 38 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.7.1/plexus-containers-1.7.1.pom
Progress (1): 5.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.7.1/plexus-containers-1.7.1.pom (5.0 kB at 194 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/4.0/plexus-4.0.pom
Progress (1): 16/22 kB
Progress (1): 22 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/4.0/plexus-4.0.pom (22 kB at 1.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.pom
Progress (1): 4.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.pom (4.0 kB at 235 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.5/plexus-utils-2.0.5.pom
Progress (1): 3.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.5/plexus-utils-2.0.5.pom (3.3 kB at 208 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.pom
Progress (1): 5.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.pom (5.5 kB at 420 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7.pom
Progress (1): 11 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7.pom (11 kB at 851 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.pom
Progress (1): 6.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.pom (6.6 kB at 663 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.0/maven-settings-3.0.pom
Progress (1): 1.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.0/maven-settings-3.0.pom (1.9 kB at 145 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.pom
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.pom (2.2 kB at 202 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.pom
Progress (1): 910 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.pom (910 B at 76 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.18/plexus-components-1.1.18.pom
Progress (1): 5.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.18/plexus-components-1.1.18.pom (5.4 kB at 412 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.7/plexus-2.0.7.pom
Progress (1): 16/17 kB
Progress (1): 17 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.7/plexus-2.0.7.pom (17 kB at 1.9 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.pom
Progress (1): 3.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.pom (3.0 kB at 329 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/12/spice-parent-12.pom
Progress (1): 6.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/12/spice-parent-12.pom (6.8 kB at 566 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/4/forge-parent-4.pom
Progress (1): 8.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/4/forge-parent-4.pom (8.4 kB at 763 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.5/plexus-utils-1.5.5.pom
Progress (1): 5.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.5/plexus-utils-1.5.5.pom (5.1 kB at 735 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.pom
Progress (1): 2.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.pom (2.1 kB at 138 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.pom
Progress (1): 1.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.pom (1.9 kB at 193 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.pom
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.pom (2.2 kB at 225 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.pom
Progress (1): 2.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.pom (2.5 kB at 247 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.pom
Progress (1): 1.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.pom (1.7 kB at 152 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-parent/1.7/aether-parent-1.7.pom
Progress (1): 7.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-parent/1.7/aether-parent-1.7.pom (7.7 kB at 552 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.pom
Progress (1): 2.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.pom (2.1 kB at 159 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.pom
Progress (1): 3.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.pom (3.7 kB at 336 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.pom
Progress (1): 1.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.pom (1.7 kB at 124 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.2.1/maven-shared-utils-3.2.1.pom
Progress (1): 5.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.2.1/maven-shared-utils-3.2.1.pom (5.6 kB at 433 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/30/maven-shared-components-30.pom
Progress (1): 4.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/30/maven-shared-components-30.pom (4.6 kB at 509 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/30/maven-parent-30.pom
Progress (1): 16/41 kB
Progress (1): 33/41 kB
Progress (1): 41 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/30/maven-parent-30.pom (41 kB at 2.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.5/commons-io-2.5.pom
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.5/commons-io-2.5.pom (13 kB at 782 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/39/commons-parent-39.pom
Progress (1): 16/62 kB
Progress (1): 33/62 kB
Progress (1): 49/62 kB
Progress (1): 62 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/39/commons-parent-39.pom (62 kB at 3.6 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/16/apache-16.pom
Progress (1): 15 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/16/apache-16.pom (15 kB at 1.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.pom
Progress (1): 4.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.pom (4.7 kB at 474 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/19/maven-shared-components-19.pom
Progress (1): 6.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/19/maven-shared-components-19.pom (6.4 kB at 454 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/23/maven-parent-23.pom
Progress (1): 16/33 kB
Progress (1): 33 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/23/maven-parent-23.pom (33 kB at 2.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/13/apache-13.pom
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/13/apache-13.pom (14 kB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.1/maven-plugin-api-2.2.1.pom
Progress (1): 1.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.1/maven-plugin-api-2.2.1.pom (1.5 kB at 112 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.2.1/maven-2.2.1.pom
Progress (1): 16/22 kB
Progress (1): 22 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.2.1/maven-2.2.1.pom (22 kB at 1.9 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/11/maven-parent-11.pom
Progress (1): 16/32 kB
Progress (1): 32 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/11/maven-parent-11.pom (32 kB at 2.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/5/apache-5.pom
Progress (1): 4.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/5/apache-5.pom (4.1 kB at 341 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.1/maven-core-2.2.1.pom
Progress (1): 12 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.1/maven-core-2.2.1.pom (12 kB at 969 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.2.1/maven-settings-2.2.1.pom
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.2.1/maven-settings-2.2.1.pom (2.2 kB at 136 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.1/maven-model-2.2.1.pom
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.1/maven-model-2.2.1.pom (3.2 kB at 270 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.15/plexus-utils-1.5.15.pom
Progress (1): 6.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.15/plexus-utils-1.5.15.pom (6.8 kB at 527 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.2/plexus-2.0.2.pom
Progress (1): 12 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.2/plexus-2.0.2.pom (12 kB at 829 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.11/plexus-interpolation-1.11.pom
Progress (1): 889 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.11/plexus-interpolation-1.11.pom (889 B at 74 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.14/plexus-components-1.1.14.pom
Progress (1): 5.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.14/plexus-components-1.1.14.pom (5.8 kB at 417 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.1/maven-plugin-parameter-documenter-2.2.1.pom
Progress (1): 2.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.1/maven-plugin-parameter-documenter-2.2.1.pom (2.0 kB at 151 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-jdk14/1.5.6/slf4j-jdk14-1.5.6.pom
Progress (1): 1.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-jdk14/1.5.6/slf4j-jdk14-1.5.6.pom (1.9 kB at 127 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.5.6/slf4j-parent-1.5.6.pom
Progress (1): 7.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.5.6/slf4j-parent-1.5.6.pom (7.9 kB at 566 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.5.6/slf4j-api-1.5.6.pom
Progress (1): 3.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.5.6/slf4j-api-1.5.6.pom (3.0 kB at 298 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.5.6/jcl-over-slf4j-1.5.6.pom
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.5.6/jcl-over-slf4j-1.5.6.pom (2.2 kB at 155 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.1/maven-profile-2.2.1.pom
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.1/maven-profile-2.2.1.pom (2.2 kB at 167 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.1/maven-artifact-2.2.1.pom
Progress (1): 1.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.1/maven-artifact-2.2.1.pom (1.6 kB at 158 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.1/maven-repository-metadata-2.2.1.pom
Progress (1): 1.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.1/maven-repository-metadata-2.2.1.pom (1.9 kB at 156 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.1/maven-error-diagnostics-2.2.1.pom
Progress (1): 1.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.1/maven-error-diagnostics-2.2.1.pom (1.7 kB at 142 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.1/maven-project-2.2.1.pom
Progress (1): 2.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.1/maven-project-2.2.1.pom (2.8 kB at 185 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.1/maven-artifact-manager-2.2.1.pom
Progress (1): 3.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.1/maven-artifact-manager-2.2.1.pom (3.1 kB at 259 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/backport-util-concurrent/backport-util-concurrent/3.1/backport-util-concurrent-3.1.pom
Progress (1): 880 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/backport-util-concurrent/backport-util-concurrent/3.1/backport-util-concurrent-3.1.pom (880 B at 88 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.1/maven-plugin-registry-2.2.1.pom
Progress (1): 1.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.1/maven-plugin-registry-2.2.1.pom (1.9 kB at 148 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.1/maven-plugin-descriptor-2.2.1.pom
Progress (1): 2.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.1/maven-plugin-descriptor-2.2.1.pom (2.1 kB at 188 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.1/maven-monitor-2.2.1.pom
Progress (1): 1.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.1/maven-monitor-2.2.1.pom (1.3 kB at 70 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.1/maven-shared-utils-0.1.pom
Progress (1): 4.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.1/maven-shared-utils-0.1.pom (4.0 kB at 311 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/18/maven-shared-components-18.pom
Progress (1): 4.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/18/maven-shared-components-18.pom (4.9 kB at 449 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/22/maven-parent-22.pom
Progress (1): 16/30 kB
Progress (1): 30 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/22/maven-parent-22.pom (30 kB at 1.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/11/apache-11.pom
Progress (1): 15 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/11/apache-11.pom (15 kB at 1.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/2.0.1/jsr305-2.0.1.pom
Progress (1): 965 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/2.0.1/jsr305-2.0.1.pom (965 B at 74 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/0.9.10/plexus-java-0.9.10.pom
Progress (1): 5.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/0.9.10/plexus-java-0.9.10.pom (5.1 kB at 341 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-languages/0.9.10/plexus-languages-0.9.10.pom
Progress (1): 4.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-languages/0.9.10/plexus-languages-0.9.10.pom (4.1 kB at 296 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/6.2/asm-6.2.pom
Progress (1): 2.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/6.2/asm-6.2.pom (2.9 kB at 245 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M9/qdox-2.0-M9.pom
Progress (1): 16 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M9/qdox-2.0-M9.pom (16 kB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/9/oss-parent-9.pom
Progress (1): 6.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/9/oss-parent-9.pom (6.6 kB at 438 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.8.4/plexus-compiler-api-2.8.4.pom
Progress (1): 867 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.8.4/plexus-compiler-api-2.8.4.pom (867 B at 87 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler/2.8.4/plexus-compiler-2.8.4.pom
Progress (1): 6.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler/2.8.4/plexus-compiler-2.8.4.pom (6.0 kB at 502 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/4.0/plexus-components-4.0.pom
Progress (1): 2.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/4.0/plexus-components-4.0.pom (2.7 kB at 204 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.8.4/plexus-compiler-manager-2.8.4.pom
Progress (1): 692 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.8.4/plexus-compiler-manager-2.8.4.pom (692 B at 58 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.8.4/plexus-compiler-javac-2.8.4.pom
Progress (1): 771 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.8.4/plexus-compiler-javac-2.8.4.pom (771 B at 55 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compilers/2.8.4/plexus-compilers-2.8.4.pom
Progress (1): 1.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compilers/2.8.4/plexus-compilers-2.8.4.pom (1.3 kB at 64 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.jar
Progress (1): 16/49 kB
Progress (1): 33/49 kB
Progress (1): 49 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.jar (49 kB at 3.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7-noaop.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.jar
Progress (1): 16/202 kB
Progress (2): 16/202 kB | 16/165 kB
Progress (2): 16/202 kB | 33/165 kB
Progress (2): 33/202 kB | 33/165 kB
Progress (2): 49/202 kB | 33/165 kB
Progress (2): 62/202 kB | 33/165 kB
Progress (3): 62/202 kB | 33/165 kB | 16/472 kB
Progress (3): 62/202 kB | 33/165 kB | 33/472 kB
Progress (3): 78/202 kB | 33/165 kB | 33/472 kB
Progress (3): 95/202 kB | 33/165 kB | 33/472 kB
Progress (4): 95/202 kB | 33/165 kB | 33/472 kB | 16/52 kB
Progress (5): 95/202 kB | 33/165 kB | 33/472 kB | 16/52 kB | 16/153 kB
Progress (5): 111/202 kB | 33/165 kB | 33/472 kB | 16/52 kB | 16/153 kB
Progress (5): 111/202 kB | 33/165 kB | 33/472 kB | 16/52 kB | 33/153 kB
Progress (5): 128/202 kB | 33/165 kB | 33/472 kB | 16/52 kB | 33/153 kB
Progress (5): 144/202 kB | 33/165 kB | 33/472 kB | 16/52 kB | 33/153 kB
Progress (5): 160/202 kB | 33/165 kB | 33/472 kB | 16/52 kB | 33/153 kB
Progress (5): 160/202 kB | 49/165 kB | 33/472 kB | 16/52 kB | 33/153 kB
Progress (5): 160/202 kB | 49/165 kB | 33/472 kB | 16/52 kB | 49/153 kB
Progress (5): 160/202 kB | 62/165 kB | 33/472 kB | 16/52 kB | 49/153 kB
Progress (5): 160/202 kB | 79/165 kB | 33/472 kB | 16/52 kB | 49/153 kB
Progress (5): 160/202 kB | 79/165 kB | 33/472 kB | 16/52 kB | 63/153 kB
Progress (5): 160/202 kB | 79/165 kB | 33/472 kB | 16/52 kB | 79/153 kB
Progress (5): 160/202 kB | 79/165 kB | 33/472 kB | 16/52 kB | 95/153 kB
Progress (5): 160/202 kB | 79/165 kB | 33/472 kB | 33/52 kB | 95/153 kB
Progress (5): 177/202 kB | 79/165 kB | 33/472 kB | 33/52 kB | 95/153 kB
Progress (5): 177/202 kB | 95/165 kB | 33/472 kB | 33/52 kB | 95/153 kB
Progress (5): 177/202 kB | 112/165 kB | 33/472 kB | 33/52 kB | 95/153 kB
Progress (5): 177/202 kB | 112/165 kB | 33/472 kB | 33/52 kB | 112/153 kB
Progress (5): 177/202 kB | 128/165 kB | 33/472 kB | 33/52 kB | 112/153 kB
Progress (5): 177/202 kB | 144/165 kB | 33/472 kB | 33/52 kB | 112/153 kB
Progress (5): 177/202 kB | 144/165 kB | 33/472 kB | 33/52 kB | 128/153 kB
Progress (5): 177/202 kB | 144/165 kB | 33/472 kB | 33/52 kB | 145/153 kB
Progress (5): 177/202 kB | 144/165 kB | 33/472 kB | 33/52 kB | 153 kB    
                                                                     
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.jar (153 kB at 916 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.4/plexus-utils-2.0.4.jar
Progress (4): 177/202 kB | 144/165 kB | 33/472 kB | 49/52 kB
Progress (4): 177/202 kB | 144/165 kB | 33/472 kB | 52 kB   
                                                         
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.jar (52 kB at 309 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.jar
Progress (3): 193/202 kB | 144/165 kB | 33/472 kB
Progress (3): 193/202 kB | 161/165 kB | 33/472 kB
Progress (3): 193/202 kB | 165 kB | 33/472 kB    
                                             
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.jar (165 kB at 936 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.0/maven-settings-3.0.jar
Progress (2): 193/202 kB | 49/472 kB
Progress (2): 193/202 kB | 61/472 kB
Progress (2): 202 kB | 61/472 kB    
                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.jar (202 kB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.jar
Progress (1): 78/472 kB
Progress (1): 94/472 kB
Progress (1): 111/472 kB
Progress (2): 111/472 kB | 16/222 kB
Progress (2): 111/472 kB | 33/222 kB
Progress (2): 111/472 kB | 49/222 kB
Progress (2): 127/472 kB | 49/222 kB
Progress (3): 127/472 kB | 49/222 kB | 16/47 kB
Progress (3): 127/472 kB | 49/222 kB | 33/47 kB
Progress (3): 127/472 kB | 49/222 kB | 47 kB   
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.0/maven-settings-3.0.jar (47 kB at 227 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.jar
Progress (3): 127/472 kB | 49/222 kB | 16/38 kB
Progress (3): 127/472 kB | 49/222 kB | 33/38 kB
Progress (3): 127/472 kB | 49/222 kB | 38 kB   
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.jar (38 kB at 180 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.jar
Progress (2): 143/472 kB | 49/222 kB
Progress (2): 143/472 kB | 66/222 kB
Progress (2): 143/472 kB | 78/222 kB
Progress (2): 143/472 kB | 95/222 kB
Progress (2): 160/472 kB | 95/222 kB
Progress (2): 176/472 kB | 95/222 kB
Progress (2): 193/472 kB | 95/222 kB
Progress (2): 209/472 kB | 95/222 kB
Progress (2): 209/472 kB | 111/222 kB
Progress (2): 209/472 kB | 128/222 kB
Progress (2): 209/472 kB | 144/222 kB
Progress (2): 209/472 kB | 160/222 kB
Progress (3): 209/472 kB | 160/222 kB | 16/148 kB
Progress (3): 209/472 kB | 160/222 kB | 33/148 kB
Progress (3): 209/472 kB | 160/222 kB | 49/148 kB
Progress (4): 209/472 kB | 160/222 kB | 49/148 kB | 16/30 kB
Progress (4): 209/472 kB | 160/222 kB | 62/148 kB | 16/30 kB
Progress (4): 209/472 kB | 160/222 kB | 78/148 kB | 16/30 kB
Progress (4): 225/472 kB | 160/222 kB | 78/148 kB | 16/30 kB
Progress (4): 225/472 kB | 177/222 kB | 78/148 kB | 16/30 kB
Progress (4): 225/472 kB | 193/222 kB | 78/148 kB | 16/30 kB
Progress (4): 225/472 kB | 193/222 kB | 95/148 kB | 16/30 kB
Progress (4): 225/472 kB | 209/222 kB | 95/148 kB | 16/30 kB
Progress (4): 225/472 kB | 222 kB | 95/148 kB | 16/30 kB    
                                                        
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.4/plexus-utils-2.0.4.jar (222 kB at 766 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.jar
Progress (3): 225/472 kB | 95/148 kB | 30 kB
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.jar (30 kB at 102 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.jar
Progress (2): 242/472 kB | 95/148 kB
Progress (2): 258/472 kB | 95/148 kB
Progress (2): 274/472 kB | 95/148 kB
Progress (2): 274/472 kB | 111/148 kB
Progress (2): 274/472 kB | 127/148 kB
Progress (2): 274/472 kB | 144/148 kB
Progress (2): 274/472 kB | 148 kB    
Progress (3): 274/472 kB | 148 kB | 16/51 kB
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.jar (148 kB at 457 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.jar
Progress (2): 291/472 kB | 16/51 kB
Progress (2): 307/472 kB | 16/51 kB
Progress (3): 307/472 kB | 16/51 kB | 16/106 kB
Progress (3): 307/472 kB | 16/51 kB | 33/106 kB
Progress (3): 324/472 kB | 16/51 kB | 33/106 kB
Progress (3): 324/472 kB | 33/51 kB | 33/106 kB
Progress (3): 340/472 kB | 33/51 kB | 33/106 kB
Progress (3): 356/472 kB | 33/51 kB | 33/106 kB
Progress (3): 373/472 kB | 33/51 kB | 33/106 kB
Progress (3): 389/472 kB | 33/51 kB | 33/106 kB
Progress (3): 406/472 kB | 33/51 kB | 33/106 kB
Progress (3): 422/472 kB | 33/51 kB | 33/106 kB
Progress (3): 438/472 kB | 33/51 kB | 33/106 kB
Progress (3): 438/472 kB | 33/51 kB | 49/106 kB
Progress (3): 455/472 kB | 33/51 kB | 49/106 kB
Progress (3): 471/472 kB | 33/51 kB | 49/106 kB
Progress (3): 471/472 kB | 49/51 kB | 49/106 kB
Progress (3): 472 kB | 49/51 kB | 49/106 kB    
                                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7-noaop.jar (472 kB at 1.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.jar
Progress (3): 49/51 kB | 49/106 kB | 14 kB
                                          
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.jar (14 kB at 34 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.jar
Progress (2): 49/51 kB | 66/106 kB
Progress (2): 49/51 kB | 82/106 kB
Progress (2): 51 kB | 82/106 kB   
                               
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.jar (51 kB at 126 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.jar
Progress (1): 98/106 kB
Progress (1): 106 kB   
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.jar (106 kB at 255 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.jar
Progress (1): 16/527 kB
Progress (2): 16/527 kB | 16/46 kB
Progress (3): 16/527 kB | 16/46 kB | 16/74 kB
Progress (3): 33/527 kB | 16/46 kB | 16/74 kB
Progress (4): 33/527 kB | 16/46 kB | 16/74 kB | 16/61 kB
Progress (4): 33/527 kB | 32/46 kB | 16/74 kB | 16/61 kB
Progress (4): 33/527 kB | 32/46 kB | 33/74 kB | 16/61 kB
Progress (5): 33/527 kB | 32/46 kB | 33/74 kB | 16/61 kB | 16/108 kB
Progress (5): 33/527 kB | 32/46 kB | 33/74 kB | 33/61 kB | 16/108 kB
Progress (5): 49/527 kB | 32/46 kB | 33/74 kB | 33/61 kB | 16/108 kB
Progress (5): 49/527 kB | 32/46 kB | 49/74 kB | 33/61 kB | 16/108 kB
Progress (5): 49/527 kB | 46 kB | 49/74 kB | 33/61 kB | 16/108 kB   
                                                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.jar (46 kB at 96 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.7.1/plexus-component-annotations-1.7.1.jar
Progress (4): 61/527 kB | 49/74 kB | 33/61 kB | 16/108 kB
Progress (4): 65/527 kB | 49/74 kB | 33/61 kB | 16/108 kB
Progress (4): 65/527 kB | 66/74 kB | 33/61 kB | 16/108 kB
Progress (4): 65/527 kB | 74 kB | 33/61 kB | 16/108 kB   
                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.jar (74 kB at 153 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.jar
Progress (3): 65/527 kB | 33/61 kB | 33/108 kB
Progress (3): 65/527 kB | 49/61 kB | 33/108 kB
Progress (3): 65/527 kB | 61 kB | 33/108 kB   
Progress (3): 65/527 kB | 61 kB | 49/108 kB
                                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.jar (61 kB at 124 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.jar
Progress (2): 81/527 kB | 49/108 kB
Progress (2): 98/527 kB | 49/108 kB
Progress (2): 114/527 kB | 49/108 kB
Progress (2): 114/527 kB | 66/108 kB
Progress (3): 114/527 kB | 66/108 kB | 4.3 kB
                                             
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.7.1/plexus-component-annotations-1.7.1.jar (4.3 kB at 8.4 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.2.1/maven-shared-utils-3.2.1.jar
Progress (2): 130/527 kB | 66/108 kB
Progress (2): 130/527 kB | 82/108 kB
Progress (3): 130/527 kB | 82/108 kB | 13 kB
Progress (3): 130/527 kB | 98/108 kB | 13 kB
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.jar (13 kB at 26 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.5/commons-io-2.5.jar
Progress (2): 130/527 kB | 108 kB
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.jar (108 kB at 209 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.jar
Progress (1): 147/527 kB
Progress (1): 163/527 kB
Progress (1): 180/527 kB
Progress (2): 180/527 kB | 15/167 kB
Progress (2): 180/527 kB | 31/167 kB
Progress (3): 180/527 kB | 31/167 kB | 14 kB
Progress (3): 196/527 kB | 31/167 kB | 14 kB
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.jar (14 kB at 25 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/0.9.10/plexus-java-0.9.10.jar
Progress (2): 196/527 kB | 48/167 kB
Progress (2): 196/527 kB | 64/167 kB
Progress (2): 212/527 kB | 64/167 kB
Progress (2): 212/527 kB | 81/167 kB
Progress (2): 212/527 kB | 97/167 kB
Progress (2): 229/527 kB | 97/167 kB
Progress (3): 229/527 kB | 97/167 kB | 16/29 kB
Progress (3): 229/527 kB | 97/167 kB | 29 kB   
Progress (3): 245/527 kB | 97/167 kB | 29 kB
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.jar (29 kB at 52 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/6.2/asm-6.2.jar
Progress (2): 245/527 kB | 112/167 kB
Progress (2): 245/527 kB | 128/167 kB
Progress (2): 262/527 kB | 128/167 kB
Progress (2): 278/527 kB | 128/167 kB
Progress (2): 294/527 kB | 128/167 kB
Progress (2): 294/527 kB | 145/167 kB
Progress (2): 311/527 kB | 145/167 kB
Progress (2): 311/527 kB | 161/167 kB
Progress (3): 311/527 kB | 161/167 kB | 16/39 kB
Progress (3): 311/527 kB | 167 kB | 16/39 kB    
Progress (3): 327/527 kB | 167 kB | 16/39 kB
Progress (3): 343/527 kB | 167 kB | 16/39 kB
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.2.1/maven-shared-utils-3.2.1.jar (167 kB at 297 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M9/qdox-2.0-M9.jar
Progress (2): 360/527 kB | 16/39 kB
Progress (2): 360/527 kB | 33/39 kB
Progress (2): 360/527 kB | 39 kB   
Progress (2): 376/527 kB | 39 kB
                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/0.9.10/plexus-java-0.9.10.jar (39 kB at 70 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.8.4/plexus-compiler-api-2.8.4.jar
Progress (1): 393/527 kB
Progress (1): 409/527 kB
Progress (1): 425/527 kB
Progress (2): 425/527 kB | 16/111 kB
Progress (2): 442/527 kB | 16/111 kB
Progress (2): 458/527 kB | 16/111 kB
Progress (2): 458/527 kB | 33/111 kB
Progress (2): 458/527 kB | 49/111 kB
Progress (2): 475/527 kB | 49/111 kB
Progress (3): 475/527 kB | 49/111 kB | 16/27 kB
Progress (3): 475/527 kB | 49/111 kB | 27 kB   
Progress (3): 475/527 kB | 66/111 kB | 27 kB
Progress (3): 491/527 kB | 66/111 kB | 27 kB
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.8.4/plexus-compiler-api-2.8.4.jar (27 kB at 47 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.8.4/plexus-compiler-manager-2.8.4.jar
Progress (2): 507/527 kB | 66/111 kB
Progress (2): 524/527 kB | 66/111 kB
Progress (3): 524/527 kB | 66/111 kB | 16/317 kB
Progress (3): 527 kB | 66/111 kB | 16/317 kB    
Progress (3): 527 kB | 82/111 kB | 16/317 kB
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.jar (527 kB at 902 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.8.4/plexus-compiler-javac-2.8.4.jar
Progress (2): 98/111 kB | 16/317 kB
Progress (2): 111 kB | 16/317 kB   
Progress (2): 111 kB | 32/317 kB
                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/6.2/asm-6.2.jar (111 kB at 188 kB/s)
Progress (1): 49/317 kB
Progress (1): 65/317 kB
Progress (1): 81/317 kB
Progress (1): 98/317 kB
Progress (1): 114/317 kB
Progress (2): 114/317 kB | 4.7 kB
Progress (2): 130/317 kB | 4.7 kB
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.8.4/plexus-compiler-manager-2.8.4.jar (4.7 kB at 7.8 kB/s)
Progress (1): 147/317 kB
Progress (1): 163/317 kB
Progress (1): 180/317 kB
Progress (1): 196/317 kB
Progress (1): 212/317 kB
Progress (2): 212/317 kB | 16/21 kB
Progress (2): 212/317 kB | 21 kB   
                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.8.4/plexus-compiler-javac-2.8.4.jar (21 kB at 35 kB/s)
Progress (1): 229/317 kB
Progress (1): 245/317 kB
Progress (1): 262/317 kB
Progress (1): 278/317 kB
Progress (1): 294/317 kB
Progress (1): 311/317 kB
Progress (1): 317 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M9/qdox-2.0-M9.jar (317 kB at 515 kB/s)
Progress (1): 16/209 kB
Progress (1): 33/209 kB
Progress (1): 49/209 kB
Progress (1): 66/209 kB
Progress (1): 82/209 kB
Progress (1): 98/209 kB
Progress (1): 115/209 kB
Progress (1): 131/209 kB
Progress (1): 147/209 kB
Progress (1): 164/209 kB
Progress (1): 180/209 kB
Progress (1): 197/209 kB
Progress (1): 209 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.5/commons-io-2.5.jar (209 kB at 272 kB/s)
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 2 source files to /var/jenkins_home/workspace/java-cicd-clean@2/target/classes
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ math-utils ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /var/jenkins_home/workspace/java-cicd-clean@2/src/test/resources
[INFO] 
[INFO] --- compiler:3.8.1:testCompile (default-testCompile) @ math-utils ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /var/jenkins_home/workspace/java-cicd-clean@2/target/test-classes
[INFO] 
[INFO] --- surefire:2.22.2:test (default-test) @ math-utils ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/2.22.2/maven-surefire-common-2.22.2.pom
Progress (1): 11 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/2.22.2/maven-surefire-common-2.22.2.pom (11 kB at 764 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.5.2/maven-plugin-annotations-3.5.2.pom
Progress (1): 1.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.5.2/maven-plugin-annotations-3.5.2.pom (1.6 kB at 163 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-tools/3.5.2/maven-plugin-tools-3.5.2.pom
Progress (1): 15 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-tools/3.5.2/maven-plugin-tools-3.5.2.pom (15 kB at 1.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/31/maven-parent-31.pom
Progress (1): 16/43 kB
Progress (1): 32/43 kB
Progress (1): 43 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/31/maven-parent-31.pom (43 kB at 2.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/19/apache-19.pom
Progress (1): 15 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/19/apache-19.pom (15 kB at 1.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/2.22.2/surefire-api-2.22.2.pom
Progress (1): 3.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/2.22.2/surefire-api-2.22.2.pom (3.5 kB at 354 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/2.22.2/surefire-logger-api-2.22.2.pom
Progress (1): 2.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/2.22.2/surefire-logger-api-2.22.2.pom (2.0 kB at 196 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/2.22.2/surefire-booter-2.22.2.pom
Progress (1): 7.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/2.22.2/surefire-booter-2.22.2.pom (7.5 kB at 745 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9-stable-1/plexus-container-default-1.0-alpha-9-stable-1.pom
Progress (1): 3.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9-stable-1/plexus-container-default-1.0-alpha-9-stable-1.pom (3.9 kB at 359 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.pom
Progress (1): 16/24 kB
Progress (1): 24 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.pom (24 kB at 1.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1/classworlds-1.1.pom
Progress (1): 3.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1/classworlds-1.1.pom (3.3 kB at 185 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-toolchain/2.2.1/maven-toolchain-2.2.1.pom
Progress (1): 3.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-toolchain/2.2.1/maven-toolchain-2.2.1.pom (3.3 kB at 167 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M8/qdox-2.0-M8.pom
Progress (1): 16 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M8/qdox-2.0-M8.pom (16 kB at 880 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/2.22.2/maven-surefire-common-2.22.2.jar
Progress (1): 16/528 kB
Progress (1): 33/528 kB
Progress (1): 49/528 kB
Progress (1): 66/528 kB
Progress (1): 82/528 kB
Progress (1): 98/528 kB
Progress (1): 115/528 kB
Progress (1): 131/528 kB
Progress (1): 147/528 kB
Progress (1): 164/528 kB
Progress (1): 180/528 kB
Progress (1): 197/528 kB
Progress (1): 213/528 kB
Progress (1): 229/528 kB
Progress (1): 246/528 kB
Progress (1): 262/528 kB
Progress (1): 279/528 kB
Progress (1): 295/528 kB
Progress (1): 311/528 kB
Progress (1): 328/528 kB
Progress (1): 344/528 kB
Progress (1): 360/528 kB
Progress (1): 377/528 kB
Progress (1): 393/528 kB
Progress (1): 410/528 kB
Progress (1): 426/528 kB
Progress (1): 442/528 kB
Progress (1): 459/528 kB
Progress (1): 475/528 kB
Progress (1): 492/528 kB
Progress (1): 508/528 kB
Progress (1): 524/528 kB
Progress (1): 528 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/2.22.2/maven-surefire-common-2.22.2.jar (528 kB at 6.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.1/maven-plugin-api-2.2.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.5.2/maven-plugin-annotations-3.5.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/2.22.2/surefire-api-2.22.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/2.22.2/surefire-logger-api-2.22.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/2.22.2/surefire-booter-2.22.2.jar
Progress (1): 14 kB
Progress (2): 14 kB | 12 kB
                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.5.2/maven-plugin-annotations-3.5.2.jar (14 kB at 679 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.1/maven-plugin-api-2.2.1.jar (12 kB at 562 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.1/maven-artifact-2.2.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.15/plexus-utils-1.5.15.jar
Progress (1): 16/186 kB
Progress (1): 33/186 kB
Progress (1): 49/186 kB
Progress (2): 49/186 kB | 16/274 kB
Progress (2): 49/186 kB | 32/274 kB
Progress (2): 49/186 kB | 49/274 kB
Progress (2): 49/186 kB | 65/274 kB
Progress (2): 49/186 kB | 81/274 kB
Progress (3): 49/186 kB | 81/274 kB | 16/228 kB
Progress (3): 49/186 kB | 98/274 kB | 16/228 kB
Progress (3): 49/186 kB | 98/274 kB | 33/228 kB
Progress (3): 49/186 kB | 114/274 kB | 33/228 kB
Progress (3): 49/186 kB | 130/274 kB | 33/228 kB
Progress (3): 49/186 kB | 147/274 kB | 33/228 kB
Progress (3): 49/186 kB | 163/274 kB | 33/228 kB
Progress (4): 49/186 kB | 163/274 kB | 33/228 kB | 16/80 kB
Progress (4): 49/186 kB | 163/274 kB | 33/228 kB | 33/80 kB
Progress (4): 49/186 kB | 163/274 kB | 49/228 kB | 33/80 kB
Progress (4): 49/186 kB | 163/274 kB | 54/228 kB | 33/80 kB
Progress (4): 49/186 kB | 180/274 kB | 54/228 kB | 33/80 kB
Progress (4): 49/186 kB | 180/274 kB | 54/228 kB | 49/80 kB
Progress (4): 49/186 kB | 180/274 kB | 62/228 kB | 49/80 kB
Progress (4): 49/186 kB | 180/274 kB | 62/228 kB | 66/80 kB
Progress (4): 49/186 kB | 180/274 kB | 62/228 kB | 80 kB   
Progress (4): 49/186 kB | 196/274 kB | 62/228 kB | 80 kB
Progress (4): 49/186 kB | 196/274 kB | 79/228 kB | 80 kB
                                                        
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.1/maven-artifact-2.2.1.jar (80 kB at 1.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.1/maven-plugin-descriptor-2.2.1.jar
Progress (3): 49/186 kB | 212/274 kB | 79/228 kB
Progress (3): 49/186 kB | 212/274 kB | 95/228 kB
Progress (3): 49/186 kB | 212/274 kB | 112/228 kB
Progress (3): 49/186 kB | 229/274 kB | 112/228 kB
Progress (3): 49/186 kB | 245/274 kB | 112/228 kB
Progress (3): 49/186 kB | 245/274 kB | 128/228 kB
Progress (3): 49/186 kB | 262/274 kB | 128/228 kB
Progress (3): 49/186 kB | 274 kB | 128/228 kB    
Progress (3): 66/186 kB | 274 kB | 128/228 kB
                                             
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/2.22.2/surefire-booter-2.22.2.jar (274 kB at 3.8 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9-stable-1/plexus-container-default-1.0-alpha-9-stable-1.jar
Progress (2): 66/186 kB | 144/228 kB
Progress (2): 82/186 kB | 144/228 kB
Progress (2): 98/186 kB | 144/228 kB
Progress (3): 98/186 kB | 144/228 kB | 16/39 kB
Progress (3): 98/186 kB | 161/228 kB | 16/39 kB
Progress (3): 98/186 kB | 161/228 kB | 32/39 kB
Progress (3): 111/186 kB | 161/228 kB | 32/39 kB
Progress (3): 111/186 kB | 177/228 kB | 32/39 kB
Progress (3): 111/186 kB | 177/228 kB | 39 kB   
                                             
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.1/maven-plugin-descriptor-2.2.1.jar (39 kB at 462 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.jar
Progress (2): 128/186 kB | 177/228 kB
Progress (2): 128/186 kB | 193/228 kB
Progress (2): 144/186 kB | 193/228 kB
Progress (2): 160/186 kB | 193/228 kB
Progress (2): 160/186 kB | 210/228 kB
Progress (2): 160/186 kB | 226/228 kB
Progress (2): 160/186 kB | 228 kB    
Progress (2): 177/186 kB | 228 kB
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.15/plexus-utils-1.5.15.jar (228 kB at 2.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.1/maven-project-2.2.1.jar
Progress (1): 186 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/2.22.2/surefire-api-2.22.2.jar (186 kB at 2.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.2.1/maven-settings-2.2.1.jar
Progress (1): 16/194 kB
Progress (1): 33/194 kB
Progress (1): 49/194 kB
Progress (2): 49/194 kB | 16/315 kB
Progress (2): 64/194 kB | 16/315 kB
Progress (2): 80/194 kB | 16/315 kB
Progress (2): 80/194 kB | 32/315 kB
Progress (2): 80/194 kB | 49/315 kB
Progress (3): 80/194 kB | 49/315 kB | 16/49 kB
Progress (3): 80/194 kB | 65/315 kB | 16/49 kB
Progress (3): 97/194 kB | 65/315 kB | 16/49 kB
Progress (4): 97/194 kB | 65/315 kB | 16/49 kB | 16/156 kB
Progress (4): 97/194 kB | 65/315 kB | 16/49 kB | 32/156 kB
Progress (4): 97/194 kB | 65/315 kB | 16/49 kB | 49/156 kB
Progress (4): 97/194 kB | 65/315 kB | 16/49 kB | 65/156 kB
Progress (4): 97/194 kB | 65/315 kB | 16/49 kB | 67/156 kB
Progress (4): 97/194 kB | 65/315 kB | 16/49 kB | 84/156 kB
Progress (4): 97/194 kB | 81/315 kB | 16/49 kB | 84/156 kB
Progress (4): 97/194 kB | 81/315 kB | 33/49 kB | 84/156 kB
Progress (4): 113/194 kB | 81/315 kB | 33/49 kB | 84/156 kB
Progress (4): 130/194 kB | 81/315 kB | 33/49 kB | 84/156 kB
Progress (4): 130/194 kB | 81/315 kB | 33/49 kB | 100/156 kB
Progress (4): 130/194 kB | 81/315 kB | 49 kB | 100/156 kB   
Progress (4): 130/194 kB | 98/315 kB | 49 kB | 100/156 kB
                                                         
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.2.1/maven-settings-2.2.1.jar (49 kB at 377 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.1/maven-profile-2.2.1.jar
Progress (3): 130/194 kB | 98/315 kB | 116/156 kB
Progress (3): 130/194 kB | 98/315 kB | 133/156 kB
Progress (3): 146/194 kB | 98/315 kB | 133/156 kB
Progress (3): 146/194 kB | 98/315 kB | 149/156 kB
Progress (3): 146/194 kB | 98/315 kB | 156 kB    
                                             
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.1/maven-project-2.2.1.jar (156 kB at 1.1 MB/s)
Progress (2): 146/194 kB | 114/315 kB
                                     
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.1/maven-artifact-manager-2.2.1.jar
Progress (2): 162/194 kB | 114/315 kB
Progress (2): 179/194 kB | 114/315 kB
Progress (3): 179/194 kB | 114/315 kB | 16/35 kB
Progress (3): 179/194 kB | 130/315 kB | 16/35 kB
Progress (3): 194 kB | 130/315 kB | 16/35 kB    
Progress (3): 194 kB | 147/315 kB | 16/35 kB
Progress (3): 194 kB | 147/315 kB | 33/35 kB
Progress (3): 194 kB | 147/315 kB | 35 kB   
Progress (3): 194 kB | 163/315 kB | 35 kB
Progress (3): 194 kB | 180/315 kB | 35 kB
                                         
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9-stable-1/plexus-container-default-1.0-alpha-9-stable-1.jar (194 kB at 1.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/backport-util-concurrent/backport-util-concurrent/3.1/backport-util-concurrent-3.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.1/maven-profile-2.2.1.jar (35 kB at 234 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.1/maven-plugin-registry-2.2.1.jar
Progress (1): 196/315 kB
Progress (1): 212/315 kB
Progress (1): 229/315 kB
Progress (1): 245/315 kB
Progress (1): 262/315 kB
Progress (1): 278/315 kB
Progress (1): 294/315 kB
Progress (1): 311/315 kB
Progress (1): 315 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.jar (315 kB at 2.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.11/plexus-interpolation-1.11.jar
Progress (1): 16/68 kB
Progress (2): 16/68 kB | 16/30 kB
Progress (2): 32/68 kB | 16/30 kB
Progress (2): 49/68 kB | 16/30 kB
Progress (2): 49/68 kB | 30 kB   
Progress (2): 65/68 kB | 30 kB
Progress (2): 68 kB | 30 kB   
                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.1/maven-plugin-registry-2.2.1.jar (30 kB at 171 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.1/maven-model-2.2.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.1/maven-artifact-manager-2.2.1.jar (68 kB at 386 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.1/maven-core-2.2.1.jar
Progress (1): 16/51 kB
Progress (1): 32/51 kB
Progress (1): 49/51 kB
Progress (1): 51 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.11/plexus-interpolation-1.11.jar (51 kB at 270 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.1/maven-plugin-parameter-documenter-2.2.1.jar
Progress (1): 16/88 kB
Progress (2): 16/88 kB | 16/178 kB
Progress (2): 32/88 kB | 16/178 kB
Progress (2): 49/88 kB | 16/178 kB
Progress (2): 65/88 kB | 16/178 kB
Progress (2): 65/88 kB | 32/178 kB
Progress (3): 65/88 kB | 32/178 kB | 16/22 kB
Progress (3): 65/88 kB | 32/178 kB | 22 kB   
                                          
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.1/maven-plugin-parameter-documenter-2.2.1.jar (22 kB at 109 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-jdk14/1.5.6/slf4j-jdk14-1.5.6.jar
Progress (2): 65/88 kB | 49/178 kB
Progress (2): 81/88 kB | 49/178 kB
Progress (2): 81/88 kB | 62/178 kB
Progress (2): 88 kB | 62/178 kB   
Progress (2): 88 kB | 78/178 kB
                               
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.1/maven-model-2.2.1.jar (88 kB at 421 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.5.6/slf4j-api-1.5.6.jar
Progress (1): 95/178 kB
Progress (1): 111/178 kB
Progress (1): 127/178 kB
Progress (1): 144/178 kB
Progress (2): 144/178 kB | 8.8 kB
Progress (2): 160/178 kB | 8.8 kB
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-jdk14/1.5.6/slf4j-jdk14-1.5.6.jar (8.8 kB at 41 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.5.6/jcl-over-slf4j-1.5.6.jar
Progress (1): 176/178 kB
Progress (1): 178 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.1/maven-core-2.2.1.jar (178 kB at 809 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.1/maven-repository-metadata-2.2.1.jar
Progress (1): 16/22 kB
Progress (1): 22 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.5.6/slf4j-api-1.5.6.jar (22 kB at 101 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.1/maven-error-diagnostics-2.2.1.jar
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/2.22.2/surefire-logger-api-2.22.2.jar (13 kB at 56 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.1/maven-monitor-2.2.1.jar
Progress (1): 16/26 kB
Progress (2): 16/26 kB | 16/17 kB
Progress (2): 16/26 kB | 17 kB   
                              
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.5.6/jcl-over-slf4j-1.5.6.jar (17 kB at 70 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1/classworlds-1.1.jar
Progress (1): 26 kB
Progress (2): 26 kB | 13 kB
                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.1/maven-error-diagnostics-2.2.1.jar (13 kB at 54 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.1/maven-repository-metadata-2.2.1.jar (26 kB at 107 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-toolchain/2.2.1/maven-toolchain-2.2.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M8/qdox-2.0-M8.jar
Progress (1): 10 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.1/maven-monitor-2.2.1.jar (10 kB at 41 kB/s)
Progress (1): 16/38 kB
Progress (1): 33/38 kB
Progress (1): 38 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1/classworlds-1.1.jar (38 kB at 146 kB/s)
Progress (1): 16/316 kB
Progress (1): 33/316 kB
Progress (1): 49/316 kB
Progress (1): 65/316 kB
Progress (1): 82/316 kB
Progress (1): 98/316 kB
Progress (1): 114/316 kB
Progress (1): 131/316 kB
Progress (1): 147/316 kB
Progress (1): 164/316 kB
Progress (1): 180/316 kB
Progress (1): 196/316 kB
Progress (1): 213/316 kB
Progress (1): 229/316 kB
Progress (1): 245/316 kB
Progress (1): 262/316 kB
Progress (1): 266/316 kB
Progress (1): 282/316 kB
Progress (1): 299/316 kB
Progress (1): 315/316 kB
Progress (1): 316 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M8/qdox-2.0-M8.jar (316 kB at 1.0 MB/s)
Progress (1): 16/332 kB
Progress (1): 33/332 kB
Progress (1): 49/332 kB
Progress (1): 62/332 kB
Progress (1): 78/332 kB
Progress (1): 95/332 kB
Progress (1): 111/332 kB
Progress (1): 127/332 kB
Progress (1): 144/332 kB
Progress (1): 160/332 kB
Progress (1): 176/332 kB
Progress (1): 193/332 kB
Progress (1): 209/332 kB
Progress (1): 226/332 kB
Progress (1): 242/332 kB
Progress (1): 258/332 kB
Progress (1): 275/332 kB
Progress (1): 291/332 kB
Progress (1): 308/332 kB
Progress (1): 324/332 kB
Progress (1): 332 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/backport-util-concurrent/backport-util-concurrent/3.1/backport-util-concurrent-3.1.jar (332 kB at 779 kB/s)
Progress (1): 16/38 kB
Progress (1): 33/38 kB
Progress (1): 38 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-toolchain/2.2.1/maven-toolchain-2.2.1.jar (38 kB at 79 kB/s)
[INFO] Tests are skipped.
[INFO] 
[INFO] --- jacoco:0.8.8:report (report) @ math-utils ---
[INFO] Skipping JaCoCo execution due to missing execution data file.
[INFO] 
[INFO] --- jacoco:0.8.8:report (post-unit-test) @ math-utils ---
[INFO] Skipping JaCoCo execution due to missing execution data file.
[INFO] 
[INFO] --- jar:3.4.1:jar (default-jar) @ math-utils ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/3.1.0/file-management-3.1.0.pom
Progress (1): 4.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/3.1.0/file-management-3.1.0.pom (4.5 kB at 107 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/36/maven-shared-components-36.pom
Progress (1): 4.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/36/maven-shared-components-36.pom (4.9 kB at 196 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/36/maven-parent-36.pom
Progress (1): 16/45 kB
Progress (1): 33/45 kB
Progress (1): 45 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/36/maven-parent-36.pom (45 kB at 2.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/26/apache-26.pom
Progress (1): 16/21 kB
Progress (1): 21 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/26/apache-26.pom (21 kB at 1.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.1/plexus-utils-4.0.1.pom
Progress (1): 7.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.1/plexus-utils-4.0.1.pom (7.8 kB at 391 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/17/plexus-17.pom
Progress (1): 16/28 kB
Progress (1): 28 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/17/plexus-17.pom (28 kB at 1.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.16.1/commons-io-2.16.1.pom
Progress (1): 16/20 kB
Progress (1): 20 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.16.1/commons-io-2.16.1.pom (20 kB at 1.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/69/commons-parent-69.pom
Progress (1): 16/77 kB
Progress (1): 33/77 kB
Progress (1): 49/77 kB
Progress (1): 66/77 kB
Progress (1): 77 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/69/commons-parent-69.pom (77 kB at 1.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/31/apache-31.pom
Progress (1): 16/24 kB
Progress (1): 24 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/31/apache-31.pom (24 kB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.6.2/maven-archiver-3.6.2.pom
Progress (1): 4.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.6.2/maven-archiver-3.6.2.pom (4.4 kB at 313 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/41/maven-shared-components-41.pom
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/41/maven-shared-components-41.pom (3.2 kB at 198 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/41/maven-parent-41.pom
Progress (1): 16/50 kB
Progress (1): 33/50 kB
Progress (1): 49/50 kB
Progress (1): 50 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/41/maven-parent-41.pom (50 kB at 1.9 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.9.2/plexus-archiver-4.9.2.pom
Progress (1): 6.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.9.2/plexus-archiver-4.9.2.pom (6.0 kB at 260 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/3.4.2/plexus-io-3.4.2.pom
Progress (1): 3.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/3.4.2/plexus-io-3.4.2.pom (3.9 kB at 241 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/16/plexus-16.pom
Progress (1): 16/28 kB
Progress (1): 28 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/16/plexus-16.pom (28 kB at 1.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.1/junit-bom-5.10.1.pom
Progress (1): 5.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.1/junit-bom-5.10.1.pom (5.6 kB at 257 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.26.1/commons-compress-1.26.1.pom
Progress (1): 16/22 kB
Progress (1): 22 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.26.1/commons-compress-1.26.1.pom (22 kB at 1.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/66/commons-parent-66.pom
Progress (1): 16/77 kB
Progress (1): 33/77 kB
Progress (1): 49/77 kB
Progress (1): 66/77 kB
Progress (1): 77 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/66/commons-parent-66.pom (77 kB at 1.9 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.16.1/commons-codec-1.16.1.pom
Progress (1): 16 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.16.1/commons-codec-1.16.1.pom (16 kB at 825 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.14.0/commons-lang3-3.14.0.pom
Progress (1): 16/31 kB
Progress (1): 31 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.14.0/commons-lang3-3.14.0.pom (31 kB at 1.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/64/commons-parent-64.pom
Progress (1): 16/78 kB
Progress (1): 33/78 kB
Progress (1): 49/78 kB
Progress (1): 66/78 kB
Progress (1): 78 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/64/commons-parent-64.pom (78 kB at 2.8 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/30/apache-30.pom
Progress (1): 16/23 kB
Progress (1): 23 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/30/apache-30.pom (23 kB at 1.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.0/junit-bom-5.10.0.pom
Progress (1): 5.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.0/junit-bom-5.10.0.pom (5.6 kB at 435 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/iq80/snappy/snappy/0.4/snappy-0.4.pom
Progress (1): 15 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/iq80/snappy/snappy/0.4/snappy-0.4.pom (15 kB at 808 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.9/xz-1.9.pom
Progress (1): 2.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.9/xz-1.9.pom (2.0 kB at 57 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.5-11/zstd-jni-1.5.5-11.pom
Progress (1): 2.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.5-11/zstd-jni-1.5.5-11.pom (2.0 kB at 112 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.27/plexus-interpolation-1.27.pom
Progress (1): 3.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.27/plexus-interpolation-1.27.pom (3.0 kB at 131 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/3.1.0/file-management-3.1.0.jar
Progress (1): 16/36 kB
Progress (1): 33/36 kB
Progress (1): 36 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/3.1.0/file-management-3.1.0.jar (36 kB at 2.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.16.1/commons-io-2.16.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.27/plexus-interpolation-1.27.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.1/plexus-utils-4.0.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.6.2/maven-archiver-3.6.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.9.2/plexus-archiver-4.9.2.jar
Progress (1): 16/509 kB
Progress (1): 33/509 kB
Progress (2): 33/509 kB | 16/27 kB
Progress (2): 49/509 kB | 16/27 kB
Progress (3): 49/509 kB | 16/27 kB | 16/86 kB
Progress (4): 49/509 kB | 16/27 kB | 16/86 kB | 16/225 kB
Progress (4): 49/509 kB | 16/27 kB | 16/86 kB | 33/225 kB
Progress (4): 49/509 kB | 27 kB | 16/86 kB | 33/225 kB   
                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.6.2/maven-archiver-3.6.2.jar (27 kB at 400 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/3.4.2/plexus-io-3.4.2.jar
Progress (3): 49/509 kB | 16/86 kB | 49/225 kB
Progress (3): 63/509 kB | 16/86 kB | 49/225 kB
Progress (3): 63/509 kB | 33/86 kB | 49/225 kB
Progress (3): 63/509 kB | 33/86 kB | 66/225 kB
Progress (3): 79/509 kB | 33/86 kB | 66/225 kB
Progress (3): 79/509 kB | 49/86 kB | 66/225 kB
Progress (3): 79/509 kB | 66/86 kB | 66/225 kB
Progress (3): 96/509 kB | 66/86 kB | 66/225 kB
Progress (3): 112/509 kB | 66/86 kB | 66/225 kB
Progress (3): 112/509 kB | 82/86 kB | 66/225 kB
Progress (3): 129/509 kB | 82/86 kB | 66/225 kB
Progress (4): 129/509 kB | 82/86 kB | 66/225 kB | 16/193 kB
Progress (4): 129/509 kB | 82/86 kB | 66/225 kB | 33/193 kB
Progress (4): 129/509 kB | 86 kB | 66/225 kB | 33/193 kB   
                                                        
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.27/plexus-interpolation-1.27.jar (86 kB at 795 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.26.1/commons-compress-1.26.1.jar
Progress (3): 129/509 kB | 82/225 kB | 33/193 kB
Progress (3): 129/509 kB | 82/225 kB | 49/193 kB
Progress (4): 129/509 kB | 82/225 kB | 49/193 kB | 16/79 kB
Progress (4): 129/509 kB | 82/225 kB | 66/193 kB | 16/79 kB
Progress (4): 129/509 kB | 82/225 kB | 82/193 kB | 16/79 kB
Progress (4): 129/509 kB | 98/225 kB | 82/193 kB | 16/79 kB
Progress (4): 129/509 kB | 98/225 kB | 82/193 kB | 33/79 kB
Progress (4): 129/509 kB | 98/225 kB | 98/193 kB | 33/79 kB
Progress (4): 129/509 kB | 98/225 kB | 115/193 kB | 33/79 kB
Progress (4): 129/509 kB | 98/225 kB | 115/193 kB | 49/79 kB
Progress (5): 129/509 kB | 98/225 kB | 115/193 kB | 49/79 kB | 0/1.1 MB
Progress (5): 129/509 kB | 98/225 kB | 131/193 kB | 49/79 kB | 0/1.1 MB
Progress (5): 129/509 kB | 115/225 kB | 131/193 kB | 49/79 kB | 0/1.1 MB
Progress (5): 129/509 kB | 115/225 kB | 131/193 kB | 66/79 kB | 0/1.1 MB
Progress (5): 129/509 kB | 131/225 kB | 131/193 kB | 66/79 kB | 0/1.1 MB
Progress (5): 129/509 kB | 131/225 kB | 147/193 kB | 66/79 kB | 0/1.1 MB
Progress (5): 129/509 kB | 131/225 kB | 147/193 kB | 79 kB | 0/1.1 MB   
                                                                     
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/3.4.2/plexus-io-3.4.2.jar (79 kB at 418 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.14.0/commons-lang3-3.14.0.jar
Progress (4): 129/509 kB | 147/225 kB | 147/193 kB | 0/1.1 MB
Progress (4): 129/509 kB | 147/225 kB | 147/193 kB | 0/1.1 MB
Progress (4): 129/509 kB | 147/225 kB | 147/193 kB | 0/1.1 MB
Progress (4): 129/509 kB | 147/225 kB | 147/193 kB | 0.1/1.1 MB
Progress (4): 129/509 kB | 147/225 kB | 164/193 kB | 0.1/1.1 MB
Progress (4): 129/509 kB | 147/225 kB | 180/193 kB | 0.1/1.1 MB
Progress (4): 129/509 kB | 147/225 kB | 193 kB | 0.1/1.1 MB    
                                                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.1/plexus-utils-4.0.1.jar (193 kB at 935 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.16.1/commons-codec-1.16.1.jar
Progress (3): 145/509 kB | 147/225 kB | 0.1/1.1 MB
Progress (3): 145/509 kB | 147/225 kB | 0.1/1.1 MB
Progress (3): 161/509 kB | 147/225 kB | 0.1/1.1 MB
Progress (4): 161/509 kB | 147/225 kB | 0.1/1.1 MB | 16/658 kB
Progress (4): 178/509 kB | 147/225 kB | 0.1/1.1 MB | 16/658 kB
Progress (4): 178/509 kB | 164/225 kB | 0.1/1.1 MB | 16/658 kB
Progress (4): 178/509 kB | 180/225 kB | 0.1/1.1 MB | 16/658 kB
Progress (4): 178/509 kB | 197/225 kB | 0.1/1.1 MB | 16/658 kB
Progress (4): 178/509 kB | 197/225 kB | 0.1/1.1 MB | 33/658 kB
Progress (4): 178/509 kB | 197/225 kB | 0.1/1.1 MB | 33/658 kB
Progress (4): 178/509 kB | 197/225 kB | 0.1/1.1 MB | 33/658 kB
Progress (4): 178/509 kB | 213/225 kB | 0.1/1.1 MB | 33/658 kB
Progress (4): 178/509 kB | 213/225 kB | 0.1/1.1 MB | 33/658 kB
Progress (4): 178/509 kB | 225 kB | 0.1/1.1 MB | 33/658 kB    
                                                          
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.9.2/plexus-archiver-4.9.2.jar (225 kB at 960 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/iq80/snappy/snappy/0.4/snappy-0.4.jar
Progress (3): 178/509 kB | 0.1/1.1 MB | 49/658 kB
Progress (3): 178/509 kB | 0.1/1.1 MB | 49/658 kB
Progress (3): 178/509 kB | 0.1/1.1 MB | 63/658 kB
Progress (3): 194/509 kB | 0.1/1.1 MB | 63/658 kB
Progress (3): 210/509 kB | 0.1/1.1 MB | 63/658 kB
Progress (3): 227/509 kB | 0.1/1.1 MB | 63/658 kB
Progress (3): 227/509 kB | 0.1/1.1 MB | 79/658 kB
Progress (4): 227/509 kB | 0.1/1.1 MB | 79/658 kB | 16/365 kB
Progress (4): 227/509 kB | 0.2/1.1 MB | 79/658 kB | 16/365 kB
Progress (4): 227/509 kB | 0.2/1.1 MB | 79/658 kB | 16/365 kB
Progress (4): 227/509 kB | 0.2/1.1 MB | 79/658 kB | 16/365 kB
Progress (4): 227/509 kB | 0.2/1.1 MB | 96/658 kB | 16/365 kB
Progress (4): 227/509 kB | 0.2/1.1 MB | 96/658 kB | 16/365 kB
Progress (4): 227/509 kB | 0.2/1.1 MB | 96/658 kB | 16/365 kB
Progress (4): 227/509 kB | 0.2/1.1 MB | 112/658 kB | 16/365 kB
Progress (4): 227/509 kB | 0.2/1.1 MB | 128/658 kB | 16/365 kB
Progress (4): 227/509 kB | 0.2/1.1 MB | 128/658 kB | 33/365 kB
Progress (4): 227/509 kB | 0.2/1.1 MB | 145/658 kB | 33/365 kB
Progress (4): 227/509 kB | 0.2/1.1 MB | 145/658 kB | 49/365 kB
Progress (4): 227/509 kB | 0.2/1.1 MB | 161/658 kB | 49/365 kB
Progress (4): 243/509 kB | 0.2/1.1 MB | 161/658 kB | 49/365 kB
Progress (4): 243/509 kB | 0.2/1.1 MB | 161/658 kB | 49/365 kB
Progress (4): 260/509 kB | 0.2/1.1 MB | 161/658 kB | 49/365 kB
Progress (5): 260/509 kB | 0.2/1.1 MB | 161/658 kB | 49/365 kB | 16/58 kB
Progress (5): 276/509 kB | 0.2/1.1 MB | 161/658 kB | 49/365 kB | 16/58 kB
Progress (5): 292/509 kB | 0.2/1.1 MB | 161/658 kB | 49/365 kB | 16/58 kB
Progress (5): 292/509 kB | 0.2/1.1 MB | 161/658 kB | 49/365 kB | 32/58 kB
Progress (5): 292/509 kB | 0.2/1.1 MB | 161/658 kB | 66/365 kB | 32/58 kB
Progress (5): 292/509 kB | 0.3/1.1 MB | 161/658 kB | 66/365 kB | 32/58 kB
Progress (5): 292/509 kB | 0.3/1.1 MB | 178/658 kB | 66/365 kB | 32/58 kB
Progress (5): 309/509 kB | 0.3/1.1 MB | 178/658 kB | 66/365 kB | 32/58 kB
Progress (5): 309/509 kB | 0.3/1.1 MB | 178/658 kB | 66/365 kB | 32/58 kB
Progress (5): 309/509 kB | 0.3/1.1 MB | 178/658 kB | 82/365 kB | 32/58 kB
Progress (5): 309/509 kB | 0.3/1.1 MB | 194/658 kB | 82/365 kB | 32/58 kB
Progress (5): 309/509 kB | 0.3/1.1 MB | 194/658 kB | 82/365 kB | 32/58 kB
Progress (5): 325/509 kB | 0.3/1.1 MB | 194/658 kB | 82/365 kB | 32/58 kB
Progress (5): 325/509 kB | 0.3/1.1 MB | 210/658 kB | 82/365 kB | 32/58 kB
Progress (5): 325/509 kB | 0.3/1.1 MB | 210/658 kB | 82/365 kB | 49/58 kB
Progress (5): 325/509 kB | 0.3/1.1 MB | 210/658 kB | 82/365 kB | 58 kB   
                                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/org/iq80/snappy/snappy/0.4/snappy-0.4.jar (58 kB at 212 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.9/xz-1.9.jar
Progress (4): 342/509 kB | 0.3/1.1 MB | 210/658 kB | 82/365 kB
Progress (4): 342/509 kB | 0.3/1.1 MB | 227/658 kB | 82/365 kB
Progress (4): 342/509 kB | 0.3/1.1 MB | 227/658 kB | 98/365 kB
Progress (4): 342/509 kB | 0.3/1.1 MB | 227/658 kB | 98/365 kB
Progress (4): 342/509 kB | 0.3/1.1 MB | 227/658 kB | 115/365 kB
Progress (4): 358/509 kB | 0.3/1.1 MB | 227/658 kB | 115/365 kB
Progress (4): 358/509 kB | 0.3/1.1 MB | 227/658 kB | 131/365 kB
Progress (4): 358/509 kB | 0.3/1.1 MB | 227/658 kB | 131/365 kB
Progress (4): 358/509 kB | 0.3/1.1 MB | 243/658 kB | 131/365 kB
Progress (4): 358/509 kB | 0.3/1.1 MB | 243/658 kB | 147/365 kB
Progress (4): 358/509 kB | 0.3/1.1 MB | 260/658 kB | 147/365 kB
Progress (4): 358/509 kB | 0.3/1.1 MB | 260/658 kB | 147/365 kB
Progress (4): 358/509 kB | 0.3/1.1 MB | 260/658 kB | 164/365 kB
Progress (4): 358/509 kB | 0.3/1.1 MB | 276/658 kB | 164/365 kB
Progress (4): 358/509 kB | 0.4/1.1 MB | 276/658 kB | 164/365 kB
Progress (4): 358/509 kB | 0.4/1.1 MB | 276/658 kB | 180/365 kB
Progress (4): 374/509 kB | 0.4/1.1 MB | 276/658 kB | 180/365 kB
Progress (4): 374/509 kB | 0.4/1.1 MB | 292/658 kB | 180/365 kB
Progress (4): 374/509 kB | 0.4/1.1 MB | 309/658 kB | 180/365 kB
Progress (4): 374/509 kB | 0.4/1.1 MB | 309/658 kB | 197/365 kB
Progress (4): 374/509 kB | 0.4/1.1 MB | 325/658 kB | 197/365 kB
Progress (4): 374/509 kB | 0.4/1.1 MB | 325/658 kB | 213/365 kB
Progress (4): 391/509 kB | 0.4/1.1 MB | 325/658 kB | 213/365 kB
Progress (4): 407/509 kB | 0.4/1.1 MB | 325/658 kB | 213/365 kB
Progress (4): 407/509 kB | 0.4/1.1 MB | 325/658 kB | 229/365 kB
Progress (4): 407/509 kB | 0.4/1.1 MB | 325/658 kB | 229/365 kB
Progress (4): 423/509 kB | 0.4/1.1 MB | 325/658 kB | 229/365 kB
Progress (4): 423/509 kB | 0.4/1.1 MB | 341/658 kB | 229/365 kB
Progress (4): 440/509 kB | 0.4/1.1 MB | 341/658 kB | 229/365 kB
Progress (4): 440/509 kB | 0.4/1.1 MB | 341/658 kB | 246/365 kB
Progress (4): 440/509 kB | 0.4/1.1 MB | 358/658 kB | 246/365 kB
Progress (4): 456/509 kB | 0.4/1.1 MB | 358/658 kB | 246/365 kB
Progress (4): 456/509 kB | 0.4/1.1 MB | 358/658 kB | 262/365 kB
Progress (4): 456/509 kB | 0.4/1.1 MB | 358/658 kB | 262/365 kB
Progress (5): 456/509 kB | 0.4/1.1 MB | 358/658 kB | 262/365 kB | 16/116 kB
Progress (5): 456/509 kB | 0.4/1.1 MB | 358/658 kB | 262/365 kB | 32/116 kB
Progress (5): 456/509 kB | 0.4/1.1 MB | 358/658 kB | 262/365 kB | 49/116 kB
Progress (5): 456/509 kB | 0.4/1.1 MB | 358/658 kB | 262/365 kB | 65/116 kB
Progress (5): 456/509 kB | 0.4/1.1 MB | 374/658 kB | 262/365 kB | 65/116 kB
Progress (5): 456/509 kB | 0.4/1.1 MB | 374/658 kB | 279/365 kB | 65/116 kB
Progress (5): 456/509 kB | 0.4/1.1 MB | 374/658 kB | 279/365 kB | 65/116 kB
Progress (5): 473/509 kB | 0.4/1.1 MB | 374/658 kB | 279/365 kB | 65/116 kB
Progress (5): 473/509 kB | 0.4/1.1 MB | 374/658 kB | 279/365 kB | 81/116 kB
Progress (5): 473/509 kB | 0.4/1.1 MB | 374/658 kB | 295/365 kB | 81/116 kB
Progress (5): 473/509 kB | 0.4/1.1 MB | 391/658 kB | 295/365 kB | 81/116 kB
Progress (5): 489/509 kB | 0.4/1.1 MB | 391/658 kB | 295/365 kB | 81/116 kB
Progress (5): 489/509 kB | 0.4/1.1 MB | 391/658 kB | 295/365 kB | 81/116 kB
Progress (5): 505/509 kB | 0.4/1.1 MB | 391/658 kB | 295/365 kB | 81/116 kB
Progress (5): 509 kB | 0.4/1.1 MB | 391/658 kB | 295/365 kB | 81/116 kB    
Progress (5): 509 kB | 0.4/1.1 MB | 407/658 kB | 295/365 kB | 81/116 kB
Progress (5): 509 kB | 0.4/1.1 MB | 407/658 kB | 311/365 kB | 81/116 kB
Progress (5): 509 kB | 0.4/1.1 MB | 423/658 kB | 311/365 kB | 81/116 kB
Progress (5): 509 kB | 0.4/1.1 MB | 423/658 kB | 328/365 kB | 81/116 kB
Progress (5): 509 kB | 0.4/1.1 MB | 423/658 kB | 344/365 kB | 81/116 kB
Progress (5): 509 kB | 0.4/1.1 MB | 423/658 kB | 344/365 kB | 81/116 kB
                                                                       
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.16.1/commons-io-2.16.1.jar (509 kB at 1.6 MB/s)
Progress (4): 0.5/1.1 MB | 423/658 kB | 344/365 kB | 81/116 kB
                                                              
Downloading from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.5-11/zstd-jni-1.5.5-11.jar
Progress (4): 0.5/1.1 MB | 423/658 kB | 344/365 kB | 98/116 kB
Progress (4): 0.5/1.1 MB | 423/658 kB | 344/365 kB | 98/116 kB
Progress (4): 0.5/1.1 MB | 423/658 kB | 344/365 kB | 98/116 kB
Progress (4): 0.5/1.1 MB | 423/658 kB | 360/365 kB | 98/116 kB
Progress (4): 0.5/1.1 MB | 423/658 kB | 365 kB | 98/116 kB    
Progress (4): 0.5/1.1 MB | 423/658 kB | 365 kB | 114/116 kB
Progress (4): 0.5/1.1 MB | 423/658 kB | 365 kB | 116 kB    
Progress (4): 0.5/1.1 MB | 423/658 kB | 365 kB | 116 kB
Progress (4): 0.5/1.1 MB | 440/658 kB | 365 kB | 116 kB
                                                       
Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.16.1/commons-codec-1.16.1.jar (365 kB at 1.2 MB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.9/xz-1.9.jar (116 kB at 365 kB/s)
Progress (2): 0.5/1.1 MB | 440/658 kB
Progress (2): 0.5/1.1 MB | 456/658 kB
Progress (2): 0.5/1.1 MB | 456/658 kB
Progress (2): 0.5/1.1 MB | 472/658 kB
Progress (2): 0.5/1.1 MB | 489/658 kB
Progress (2): 0.6/1.1 MB | 489/658 kB
Progress (2): 0.6/1.1 MB | 505/658 kB
Progress (2): 0.6/1.1 MB | 522/658 kB
Progress (2): 0.6/1.1 MB | 538/658 kB
Progress (2): 0.6/1.1 MB | 554/658 kB
Progress (2): 0.6/1.1 MB | 554/658 kB
Progress (2): 0.6/1.1 MB | 554/658 kB
Progress (2): 0.6/1.1 MB | 571/658 kB
Progress (2): 0.6/1.1 MB | 587/658 kB
Progress (2): 0.6/1.1 MB | 587/658 kB
Progress (2): 0.6/1.1 MB | 604/658 kB
Progress (2): 0.6/1.1 MB | 620/658 kB
Progress (2): 0.6/1.1 MB | 620/658 kB
Progress (2): 0.6/1.1 MB | 620/658 kB
Progress (2): 0.6/1.1 MB | 636/658 kB
Progress (2): 0.6/1.1 MB | 653/658 kB
Progress (2): 0.6/1.1 MB | 658 kB    
Progress (2): 0.7/1.1 MB | 658 kB
Progress (2): 0.7/1.1 MB | 658 kB
Progress (2): 0.7/1.1 MB | 658 kB
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.14.0/commons-lang3-3.14.0.jar (658 kB at 2.0 MB/s)
Progress (1): 0.7/1.1 MB
Progress (1): 0.7/1.1 MB
Progress (1): 0.7/1.1 MB
Progress (2): 0.7/1.1 MB | 0/6.8 MB
Progress (2): 0.8/1.1 MB | 0/6.8 MB
Progress (2): 0.8/1.1 MB | 0/6.8 MB
Progress (2): 0.8/1.1 MB | 0/6.8 MB
Progress (2): 0.8/1.1 MB | 0/6.8 MB
Progress (2): 0.8/1.1 MB | 0.1/6.8 MB
Progress (2): 0.8/1.1 MB | 0.1/6.8 MB
Progress (2): 0.8/1.1 MB | 0.1/6.8 MB
Progress (2): 0.8/1.1 MB | 0.1/6.8 MB
Progress (2): 0.8/1.1 MB | 0.1/6.8 MB
Progress (2): 0.8/1.1 MB | 0.1/6.8 MB
Progress (2): 0.8/1.1 MB | 0.1/6.8 MB
Progress (2): 0.8/1.1 MB | 0.1/6.8 MB
Progress (2): 0.8/1.1 MB | 0.1/6.8 MB
Progress (2): 0.8/1.1 MB | 0.1/6.8 MB
Progress (2): 0.9/1.1 MB | 0.1/6.8 MB
Progress (2): 0.9/1.1 MB | 0.1/6.8 MB
Progress (2): 0.9/1.1 MB | 0.2/6.8 MB
Progress (2): 0.9/1.1 MB | 0.2/6.8 MB
Progress (2): 0.9/1.1 MB | 0.2/6.8 MB
Progress (2): 0.9/1.1 MB | 0.2/6.8 MB
Progress (2): 0.9/1.1 MB | 0.2/6.8 MB
Progress (2): 0.9/1.1 MB | 0.2/6.8 MB
Progress (2): 0.9/1.1 MB | 0.2/6.8 MB
Progress (2): 0.9/1.1 MB | 0.2/6.8 MB
Progress (2): 0.9/1.1 MB | 0.2/6.8 MB
Progress (2): 0.9/1.1 MB | 0.3/6.8 MB
Progress (2): 0.9/1.1 MB | 0.3/6.8 MB
Progress (2): 0.9/1.1 MB | 0.3/6.8 MB
Progress (2): 0.9/1.1 MB | 0.3/6.8 MB
Progress (2): 0.9/1.1 MB | 0.3/6.8 MB
Progress (2): 1.0/1.1 MB | 0.3/6.8 MB
Progress (2): 1.0/1.1 MB | 0.3/6.8 MB
Progress (2): 1.0/1.1 MB | 0.3/6.8 MB
Progress (2): 1.0/1.1 MB | 0.3/6.8 MB
Progress (2): 1.0/1.1 MB | 0.3/6.8 MB
Progress (2): 1.0/1.1 MB | 0.3/6.8 MB
Progress (2): 1.0/1.1 MB | 0.3/6.8 MB
Progress (2): 1.1/1.1 MB | 0.3/6.8 MB
Progress (2): 1.1 MB | 0.3/6.8 MB    
Progress (2): 1.1 MB | 0.3/6.8 MB
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.26.1/commons-compress-1.26.1.jar (1.1 MB at 2.8 MB/s)
Progress (1): 0.3/6.8 MB
Progress (1): 0.4/6.8 MB
Progress (1): 0.4/6.8 MB
Progress (1): 0.4/6.8 MB
Progress (1): 0.4/6.8 MB
Progress (1): 0.4/6.8 MB
Progress (1): 0.4/6.8 MB
Progress (1): 0.5/6.8 MB
Progress (1): 0.5/6.8 MB
Progress (1): 0.5/6.8 MB
Progress (1): 0.5/6.8 MB
Progress (1): 0.5/6.8 MB
Progress (1): 0.5/6.8 MB
Progress (1): 0.6/6.8 MB
Progress (1): 0.6/6.8 MB
Progress (1): 0.6/6.8 MB
Progress (1): 0.6/6.8 MB
Progress (1): 0.6/6.8 MB
Progress (1): 0.6/6.8 MB
Progress (1): 0.7/6.8 MB
Progress (1): 0.7/6.8 MB
Progress (1): 0.7/6.8 MB
Progress (1): 0.7/6.8 MB
Progress (1): 0.7/6.8 MB
Progress (1): 0.7/6.8 MB
Progress (1): 0.7/6.8 MB
Progress (1): 0.8/6.8 MB
Progress (1): 0.8/6.8 MB
Progress (1): 0.8/6.8 MB
Progress (1): 0.8/6.8 MB
Progress (1): 0.8/6.8 MB
Progress (1): 0.8/6.8 MB
Progress (1): 0.9/6.8 MB
Progress (1): 0.9/6.8 MB
Progress (1): 0.9/6.8 MB
Progress (1): 0.9/6.8 MB
Progress (1): 0.9/6.8 MB
Progress (1): 0.9/6.8 MB
Progress (1): 1.0/6.8 MB
Progress (1): 1.0/6.8 MB
Progress (1): 1.0/6.8 MB
Progress (1): 1.0/6.8 MB
Progress (1): 1.0/6.8 MB
Progress (1): 1.0/6.8 MB
Progress (1): 1.1/6.8 MB
Progress (1): 1.1/6.8 MB
Progress (1): 1.1/6.8 MB
Progress (1): 1.1/6.8 MB
Progress (1): 1.1/6.8 MB
Progress (1): 1.1/6.8 MB
Progress (1): 1.2/6.8 MB
Progress (1): 1.2/6.8 MB
Progress (1): 1.2/6.8 MB
Progress (1): 1.2/6.8 MB
Progress (1): 1.2/6.8 MB
Progress (1): 1.2/6.8 MB
Progress (1): 1.3/6.8 MB
Progress (1): 1.3/6.8 MB
Progress (1): 1.3/6.8 MB
Progress (1): 1.3/6.8 MB
Progress (1): 1.3/6.8 MB
Progress (1): 1.3/6.8 MB
Progress (1): 1.3/6.8 MB
Progress (1): 1.4/6.8 MB
Progress (1): 1.4/6.8 MB
Progress (1): 1.4/6.8 MB
Progress (1): 1.4/6.8 MB
Progress (1): 1.4/6.8 MB
Progress (1): 1.4/6.8 MB
Progress (1): 1.5/6.8 MB
Progress (1): 1.5/6.8 MB
Progress (1): 1.5/6.8 MB
Progress (1): 1.5/6.8 MB
Progress (1): 1.5/6.8 MB
Progress (1): 1.5/6.8 MB
Progress (1): 1.6/6.8 MB
Progress (1): 1.6/6.8 MB
Progress (1): 1.6/6.8 MB
Progress (1): 1.6/6.8 MB
Progress (1): 1.6/6.8 MB
Progress (1): 1.6/6.8 MB
Progress (1): 1.7/6.8 MB
Progress (1): 1.7/6.8 MB
Progress (1): 1.7/6.8 MB
Progress (1): 1.7/6.8 MB
Progress (1): 1.7/6.8 MB
Progress (1): 1.7/6.8 MB
Progress (1): 1.8/6.8 MB
Progress (1): 1.8/6.8 MB
Progress (1): 1.8/6.8 MB
Progress (1): 1.8/6.8 MB
Progress (1): 1.8/6.8 MB
Progress (1): 1.8/6.8 MB
Progress (1): 1.9/6.8 MB
Progress (1): 1.9/6.8 MB
Progress (1): 1.9/6.8 MB
Progress (1): 1.9/6.8 MB
Progress (1): 1.9/6.8 MB
Progress (1): 1.9/6.8 MB
Progress (1): 2.0/6.8 MB
Progress (1): 2.0/6.8 MB
Progress (1): 2.0/6.8 MB
Progress (1): 2.0/6.8 MB
Progress (1): 2.0/6.8 MB
Progress (1): 2.0/6.8 MB
Progress (1): 2.0/6.8 MB
Progress (1): 2.1/6.8 MB
Progress (1): 2.1/6.8 MB
Progress (1): 2.1/6.8 MB
Progress (1): 2.1/6.8 MB
Progress (1): 2.1/6.8 MB
Progress (1): 2.1/6.8 MB
Progress (1): 2.2/6.8 MB
Progress (1): 2.2/6.8 MB
Progress (1): 2.2/6.8 MB
Progress (1): 2.2/6.8 MB
Progress (1): 2.2/6.8 MB
Progress (1): 2.2/6.8 MB
Progress (1): 2.3/6.8 MB
Progress (1): 2.3/6.8 MB
Progress (1): 2.3/6.8 MB
Progress (1): 2.3/6.8 MB
Progress (1): 2.3/6.8 MB
Progress (1): 2.3/6.8 MB
Progress (1): 2.4/6.8 MB
Progress (1): 2.4/6.8 MB
Progress (1): 2.4/6.8 MB
Progress (1): 2.4/6.8 MB
Progress (1): 2.4/6.8 MB
Progress (1): 2.4/6.8 MB
Progress (1): 2.5/6.8 MB
Progress (1): 2.5/6.8 MB
Progress (1): 2.5/6.8 MB
Progress (1): 2.5/6.8 MB
Progress (1): 2.5/6.8 MB
Progress (1): 2.5/6.8 MB
Progress (1): 2.6/6.8 MB
Progress (1): 2.6/6.8 MB
Progress (1): 2.6/6.8 MB
Progress (1): 2.6/6.8 MB
Progress (1): 2.6/6.8 MB
Progress (1): 2.6/6.8 MB
Progress (1): 2.7/6.8 MB
Progress (1): 2.7/6.8 MB
Progress (1): 2.7/6.8 MB
Progress (1): 2.7/6.8 MB
Progress (1): 2.7/6.8 MB
Progress (1): 2.7/6.8 MB
Progress (1): 2.7/6.8 MB
Progress (1): 2.8/6.8 MB
Progress (1): 2.8/6.8 MB
Progress (1): 2.8/6.8 MB
Progress (1): 2.8/6.8 MB
Progress (1): 2.8/6.8 MB
Progress (1): 2.8/6.8 MB
Progress (1): 2.9/6.8 MB
Progress (1): 2.9/6.8 MB
Progress (1): 2.9/6.8 MB
Progress (1): 2.9/6.8 MB
Progress (1): 2.9/6.8 MB
Progress (1): 2.9/6.8 MB
Progress (1): 3.0/6.8 MB
Progress (1): 3.0/6.8 MB
Progress (1): 3.0/6.8 MB
Progress (1): 3.0/6.8 MB
Progress (1): 3.0/6.8 MB
Progress (1): 3.0/6.8 MB
Progress (1): 3.1/6.8 MB
Progress (1): 3.1/6.8 MB
Progress (1): 3.1/6.8 MB
Progress (1): 3.1/6.8 MB
Progress (1): 3.1/6.8 MB
Progress (1): 3.1/6.8 MB
Progress (1): 3.2/6.8 MB
Progress (1): 3.2/6.8 MB
Progress (1): 3.2/6.8 MB
Progress (1): 3.2/6.8 MB
Progress (1): 3.2/6.8 MB
Progress (1): 3.2/6.8 MB
Progress (1): 3.3/6.8 MB
Progress (1): 3.3/6.8 MB
Progress (1): 3.3/6.8 MB
Progress (1): 3.3/6.8 MB
Progress (1): 3.3/6.8 MB
Progress (1): 3.3/6.8 MB
Progress (1): 3.3/6.8 MB
Progress (1): 3.4/6.8 MB
Progress (1): 3.4/6.8 MB
Progress (1): 3.4/6.8 MB
Progress (1): 3.4/6.8 MB
Progress (1): 3.4/6.8 MB
Progress (1): 3.4/6.8 MB
Progress (1): 3.5/6.8 MB
Progress (1): 3.5/6.8 MB
Progress (1): 3.5/6.8 MB
Progress (1): 3.5/6.8 MB
Progress (1): 3.5/6.8 MB
Progress (1): 3.5/6.8 MB
Progress (1): 3.6/6.8 MB
Progress (1): 3.6/6.8 MB
Progress (1): 3.6/6.8 MB
Progress (1): 3.6/6.8 MB
Progress (1): 3.6/6.8 MB
Progress (1): 3.6/6.8 MB
Progress (1): 3.7/6.8 MB
Progress (1): 3.7/6.8 MB
Progress (1): 3.7/6.8 MB
Progress (1): 3.7/6.8 MB
Progress (1): 3.7/6.8 MB
Progress (1): 3.7/6.8 MB
Progress (1): 3.8/6.8 MB
Progress (1): 3.8/6.8 MB
Progress (1): 3.8/6.8 MB
Progress (1): 3.8/6.8 MB
Progress (1): 3.8/6.8 MB
Progress (1): 3.8/6.8 MB
Progress (1): 3.9/6.8 MB
Progress (1): 3.9/6.8 MB
Progress (1): 3.9/6.8 MB
Progress (1): 3.9/6.8 MB
Progress (1): 3.9/6.8 MB
Progress (1): 3.9/6.8 MB
Progress (1): 4.0/6.8 MB
Progress (1): 4.0/6.8 MB
Progress (1): 4.0/6.8 MB
Progress (1): 4.0/6.8 MB
Progress (1): 4.0/6.8 MB
Progress (1): 4.0/6.8 MB
Progress (1): 4.0/6.8 MB
Progress (1): 4.1/6.8 MB
Progress (1): 4.1/6.8 MB
Progress (1): 4.1/6.8 MB
Progress (1): 4.1/6.8 MB
Progress (1): 4.1/6.8 MB
Progress (1): 4.1/6.8 MB
Progress (1): 4.2/6.8 MB
Progress (1): 4.2/6.8 MB
Progress (1): 4.2/6.8 MB
Progress (1): 4.2/6.8 MB
Progress (1): 4.2/6.8 MB
Progress (1): 4.2/6.8 MB
Progress (1): 4.3/6.8 MB
Progress (1): 4.3/6.8 MB
Progress (1): 4.3/6.8 MB
Progress (1): 4.3/6.8 MB
Progress (1): 4.3/6.8 MB
Progress (1): 4.3/6.8 MB
Progress (1): 4.4/6.8 MB
Progress (1): 4.4/6.8 MB
Progress (1): 4.4/6.8 MB
Progress (1): 4.4/6.8 MB
Progress (1): 4.4/6.8 MB
Progress (1): 4.4/6.8 MB
Progress (1): 4.5/6.8 MB
Progress (1): 4.5/6.8 MB
Progress (1): 4.5/6.8 MB
Progress (1): 4.5/6.8 MB
Progress (1): 4.5/6.8 MB
Progress (1): 4.5/6.8 MB
Progress (1): 4.6/6.8 MB
Progress (1): 4.6/6.8 MB
Progress (1): 4.6/6.8 MB
Progress (1): 4.6/6.8 MB
Progress (1): 4.6/6.8 MB
Progress (1): 4.6/6.8 MB
Progress (1): 4.6/6.8 MB
Progress (1): 4.7/6.8 MB
Progress (1): 4.7/6.8 MB
Progress (1): 4.7/6.8 MB
Progress (1): 4.7/6.8 MB
Progress (1): 4.7/6.8 MB
Progress (1): 4.7/6.8 MB
Progress (1): 4.8/6.8 MB
Progress (1): 4.8/6.8 MB
Progress (1): 4.8/6.8 MB
Progress (1): 4.8/6.8 MB
Progress (1): 4.8/6.8 MB
Progress (1): 4.8/6.8 MB
Progress (1): 4.9/6.8 MB
Progress (1): 4.9/6.8 MB
Progress (1): 4.9/6.8 MB
Progress (1): 4.9/6.8 MB
Progress (1): 4.9/6.8 MB
Progress (1): 4.9/6.8 MB
Progress (1): 5.0/6.8 MB
Progress (1): 5.0/6.8 MB
Progress (1): 5.0/6.8 MB
Progress (1): 5.0/6.8 MB
Progress (1): 5.0/6.8 MB
Progress (1): 5.0/6.8 MB
Progress (1): 5.1/6.8 MB
Progress (1): 5.1/6.8 MB
Progress (1): 5.1/6.8 MB
Progress (1): 5.1/6.8 MB
Progress (1): 5.1/6.8 MB
Progress (1): 5.1/6.8 MB
Progress (1): 5.2/6.8 MB
Progress (1): 5.2/6.8 MB
Progress (1): 5.2/6.8 MB
Progress (1): 5.2/6.8 MB
Progress (1): 5.2/6.8 MB
Progress (1): 5.2/6.8 MB
Progress (1): 5.3/6.8 MB
Progress (1): 5.3/6.8 MB
Progress (1): 5.3/6.8 MB
Progress (1): 5.3/6.8 MB
Progress (1): 5.3/6.8 MB
Progress (1): 5.3/6.8 MB
Progress (1): 5.3/6.8 MB
Progress (1): 5.4/6.8 MB
Progress (1): 5.4/6.8 MB
Progress (1): 5.4/6.8 MB
Progress (1): 5.4/6.8 MB
Progress (1): 5.4/6.8 MB
Progress (1): 5.4/6.8 MB
Progress (1): 5.5/6.8 MB
Progress (1): 5.5/6.8 MB
Progress (1): 5.5/6.8 MB
Progress (1): 5.5/6.8 MB
Progress (1): 5.5/6.8 MB
Progress (1): 5.5/6.8 MB
Progress (1): 5.6/6.8 MB
Progress (1): 5.6/6.8 MB
Progress (1): 5.6/6.8 MB
Progress (1): 5.6/6.8 MB
Progress (1): 5.6/6.8 MB
Progress (1): 5.6/6.8 MB
Progress (1): 5.7/6.8 MB
Progress (1): 5.7/6.8 MB
Progress (1): 5.7/6.8 MB
Progress (1): 5.7/6.8 MB
Progress (1): 5.7/6.8 MB
Progress (1): 5.7/6.8 MB
Progress (1): 5.8/6.8 MB
Progress (1): 5.8/6.8 MB
Progress (1): 5.8/6.8 MB
Progress (1): 5.8/6.8 MB
Progress (1): 5.8/6.8 MB
Progress (1): 5.8/6.8 MB
Progress (1): 5.8/6.8 MB
Progress (1): 5.9/6.8 MB
Progress (1): 5.9/6.8 MB
Progress (1): 5.9/6.8 MB
Progress (1): 5.9/6.8 MB
Progress (1): 5.9/6.8 MB
Progress (1): 5.9/6.8 MB
Progress (1): 6.0/6.8 MB
Progress (1): 6.0/6.8 MB
Progress (1): 6.0/6.8 MB
Progress (1): 6.0/6.8 MB
Progress (1): 6.0/6.8 MB
Progress (1): 6.0/6.8 MB
Progress (1): 6.1/6.8 MB
Progress (1): 6.1/6.8 MB
Progress (1): 6.1/6.8 MB
Progress (1): 6.1/6.8 MB
Progress (1): 6.1/6.8 MB
Progress (1): 6.1/6.8 MB
Progress (1): 6.2/6.8 MB
Progress (1): 6.2/6.8 MB
Progress (1): 6.2/6.8 MB
Progress (1): 6.2/6.8 MB
Progress (1): 6.2/6.8 MB
Progress (1): 6.2/6.8 MB
Progress (1): 6.3/6.8 MB
Progress (1): 6.3/6.8 MB
Progress (1): 6.3/6.8 MB
Progress (1): 6.3/6.8 MB
Progress (1): 6.3/6.8 MB
Progress (1): 6.3/6.8 MB
Progress (1): 6.4/6.8 MB
Progress (1): 6.4/6.8 MB
Progress (1): 6.4/6.8 MB
Progress (1): 6.4/6.8 MB
Progress (1): 6.4/6.8 MB
Progress (1): 6.4/6.8 MB
Progress (1): 6.4/6.8 MB
Progress (1): 6.5/6.8 MB
Progress (1): 6.5/6.8 MB
Progress (1): 6.5/6.8 MB
Progress (1): 6.5/6.8 MB
Progress (1): 6.5/6.8 MB
Progress (1): 6.5/6.8 MB
Progress (1): 6.6/6.8 MB
Progress (1): 6.6/6.8 MB
Progress (1): 6.6/6.8 MB
Progress (1): 6.6/6.8 MB
Progress (1): 6.6/6.8 MB
Progress (1): 6.6/6.8 MB
Progress (1): 6.7/6.8 MB
Progress (1): 6.7/6.8 MB
Progress (1): 6.7/6.8 MB
Progress (1): 6.7/6.8 MB
Progress (1): 6.7/6.8 MB
Progress (1): 6.7/6.8 MB
Progress (1): 6.8/6.8 MB
Progress (1): 6.8/6.8 MB
Progress (1): 6.8 MB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.5-11/zstd-jni-1.5.5-11.jar (6.8 MB at 9.6 MB/s)
[INFO] Building jar: /var/jenkins_home/workspace/java-cicd-clean@2/target/math-utils-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- shade:3.3.0:shade (default) @ math-utils ---
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.3.0/plexus-utils-3.3.0.pom
Progress (1): 5.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.3.0/plexus-utils-3.3.0.pom (5.2 kB at 288 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-artifact-transfer/0.13.1/maven-artifact-transfer-0.13.1.pom
Progress (1): 11 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-artifact-transfer/0.13.1/maven-artifact-transfer-0.13.1.pom (11 kB at 803 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.0.0/plexus-component-annotations-2.0.0.pom
Progress (1): 750 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.0.0/plexus-component-annotations-2.0.0.pom (750 B at 58 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/2.0.0/plexus-containers-2.0.0.pom
Progress (1): 4.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/2.0.0/plexus-containers-2.0.0.pom (4.8 kB at 283 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.0/maven-common-artifact-filters-3.1.0.pom
Progress (1): 5.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.0/maven-common-artifact-filters-3.1.0.pom (5.3 kB at 440 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/33/maven-shared-components-33.pom
Progress (1): 5.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/33/maven-shared-components-33.pom (5.1 kB at 340 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.1.0/maven-shared-utils-3.1.0.pom
Progress (1): 5.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.1.0/maven-shared-utils-3.1.0.pom (5.0 kB at 332 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.5/slf4j-api-1.7.5.pom
Progress (1): 2.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.5/slf4j-api-1.7.5.pom (2.7 kB at 158 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.5/slf4j-parent-1.7.5.pom
Progress (1): 12 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.5/slf4j-parent-1.7.5.pom (12 kB at 787 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.32/slf4j-api-1.7.32.pom
Progress (1): 3.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.32/slf4j-api-1.7.32.pom (3.8 kB at 295 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.32/slf4j-parent-1.7.32.pom
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.32/slf4j-parent-1.7.32.pom (14 kB at 812 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jdom/jdom2/2.0.6.1/jdom2-2.0.6.1.pom
Progress (1): 4.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jdom/jdom2/2.0.6.1/jdom2-2.0.6.1.pom (4.6 kB at 271 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/3.0.1/maven-dependency-tree-3.0.1.pom
Progress (1): 7.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/3.0.1/maven-dependency-tree-3.0.1.pom (7.5 kB at 469 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/0.9.0.M2/aether-util-0.9.0.M2.pom
Progress (1): 2.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/0.9.0.M2/aether-util-0.9.0.M2.pom (2.0 kB at 102 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether/0.9.0.M2/aether-0.9.0.M2.pom
Progress (1): 16/28 kB
Progress (1): 28 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether/0.9.0.M2/aether-0.9.0.M2.pom (28 kB at 1.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/vafer/jdependency/2.7.0/jdependency-2.7.0.pom
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/vafer/jdependency/2.7.0/jdependency-2.7.0.pom (14 kB at 534 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.8.1/commons-lang3-3.8.1.pom
Progress (1): 16/28 kB
Progress (1): 28 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.8.1/commons-lang3-3.8.1.pom (28 kB at 2.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/47/commons-parent-47.pom
Progress (1): 16/78 kB
Progress (1): 33/78 kB
Progress (1): 49/78 kB
Progress (1): 66/78 kB
Progress (1): 78 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/47/commons-parent-47.pom (78 kB at 6.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-collections4/4.2/commons-collections4-4.2.pom
Progress (1): 16/23 kB
Progress (1): 23 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-collections4/4.2/commons-collections4-4.2.pom (23 kB at 2.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.3.0/plexus-utils-3.3.0.jar
Progress (1): 16/263 kB
Progress (1): 33/263 kB
Progress (1): 49/263 kB
Progress (1): 62/263 kB
Progress (1): 78/263 kB
Progress (1): 94/263 kB
Progress (1): 111/263 kB
Progress (1): 127/263 kB
Progress (1): 144/263 kB
Progress (1): 160/263 kB
Progress (1): 176/263 kB
Progress (1): 193/263 kB
Progress (1): 209/263 kB
Progress (1): 225/263 kB
Progress (1): 242/263 kB
Progress (1): 258/263 kB
Progress (1): 263 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.3.0/plexus-utils-3.3.0.jar (263 kB at 11 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-artifact-transfer/0.13.1/maven-artifact-transfer-0.13.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.0.0/plexus-component-annotations-2.0.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.0/maven-common-artifact-filters-3.1.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.1.0/maven-shared-utils-3.1.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.32/slf4j-api-1.7.32.jar
Progress (1): 4.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.0.0/plexus-component-annotations-2.0.0.jar (4.2 kB at 282 kB/s)
Progress (1): 16/61 kB
                      
Downloading from central: https://repo.maven.apache.org/maven2/org/jdom/jdom2/2.0.6.1/jdom2-2.0.6.1.jar
Progress (1): 33/61 kB
Progress (2): 33/61 kB | 16/42 kB
Progress (2): 33/61 kB | 33/42 kB
Progress (2): 49/61 kB | 33/42 kB
Progress (3): 49/61 kB | 33/42 kB | 16/164 kB
Progress (3): 61 kB | 33/42 kB | 16/164 kB   
Progress (3): 61 kB | 33/42 kB | 33/164 kB
Progress (3): 61 kB | 42 kB | 33/164 kB   
                                       
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.32/slf4j-api-1.7.32.jar (42 kB at 1.3 MB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.0/maven-common-artifact-filters-3.1.0.jar (61 kB at 1.9 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/3.0.1/maven-dependency-tree-3.0.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/0.9.0.M2/aether-util-0.9.0.M2.jar
Progress (1): 49/164 kB
Progress (1): 62/164 kB
Progress (1): 78/164 kB
Progress (1): 95/164 kB
Progress (1): 111/164 kB
Progress (1): 128/164 kB
Progress (1): 144/164 kB
Progress (1): 160/164 kB
Progress (1): 164 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.1.0/maven-shared-utils-3.1.0.jar (164 kB at 4.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/vafer/jdependency/2.7.0/jdependency-2.7.0.jar
Progress (1): 16/328 kB
Progress (1): 33/328 kB
Progress (1): 49/328 kB
Progress (1): 64/328 kB
Progress (2): 64/328 kB | 16/134 kB
Progress (2): 81/328 kB | 16/134 kB
Progress (2): 97/328 kB | 16/134 kB
Progress (2): 97/328 kB | 33/134 kB
Progress (2): 97/328 kB | 49/134 kB
Progress (2): 114/328 kB | 49/134 kB
Progress (2): 130/328 kB | 49/134 kB
Progress (2): 130/328 kB | 66/134 kB
Progress (2): 130/328 kB | 82/134 kB
Progress (2): 130/328 kB | 98/134 kB
Progress (2): 130/328 kB | 115/134 kB
Progress (3): 130/328 kB | 115/134 kB | 16/233 kB
Progress (3): 130/328 kB | 131/134 kB | 16/233 kB
Progress (3): 130/328 kB | 134 kB | 16/233 kB    
Progress (3): 130/328 kB | 134 kB | 33/233 kB
Progress (3): 146/328 kB | 134 kB | 33/233 kB
                                             
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/0.9.0.M2/aether-util-0.9.0.M2.jar (134 kB at 2.4 MB/s)
Progress (2): 146/328 kB | 49/233 kB
                                    
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.8.1/commons-lang3-3.8.1.jar
Progress (2): 163/328 kB | 49/233 kB
Progress (2): 163/328 kB | 66/233 kB
Progress (2): 163/328 kB | 82/233 kB
Progress (2): 163/328 kB | 97/233 kB
Progress (2): 179/328 kB | 97/233 kB
Progress (2): 179/328 kB | 113/233 kB
Progress (2): 179/328 kB | 130/233 kB
Progress (2): 195/328 kB | 130/233 kB
Progress (2): 195/328 kB | 146/233 kB
Progress (2): 212/328 kB | 146/233 kB
Progress (2): 228/328 kB | 146/233 kB
Progress (2): 245/328 kB | 146/233 kB
Progress (2): 245/328 kB | 162/233 kB
Progress (2): 245/328 kB | 179/233 kB
Progress (2): 261/328 kB | 179/233 kB
Progress (2): 277/328 kB | 179/233 kB
Progress (2): 294/328 kB | 179/233 kB
Progress (2): 294/328 kB | 195/233 kB
Progress (2): 310/328 kB | 195/233 kB
Progress (2): 310/328 kB | 212/233 kB
Progress (2): 327/328 kB | 212/233 kB
Progress (2): 328 kB | 212/233 kB    
Progress (2): 328 kB | 228/233 kB
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/jdom/jdom2/2.0.6.1/jdom2-2.0.6.1.jar (328 kB at 4.8 MB/s)
Progress (1): 233 kB
                    
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-collections4/4.2/commons-collections4-4.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/vafer/jdependency/2.7.0/jdependency-2.7.0.jar (233 kB at 3.3 MB/s)
Progress (1): 16/502 kB
Progress (1): 33/502 kB
Progress (1): 49/502 kB
Progress (1): 64/502 kB
Progress (1): 80/502 kB
Progress (1): 96/502 kB
Progress (1): 113/502 kB
Progress (2): 113/502 kB | 15/753 kB
Progress (2): 129/502 kB | 15/753 kB
Progress (2): 146/502 kB | 15/753 kB
Progress (2): 146/502 kB | 31/753 kB
Progress (2): 162/502 kB | 31/753 kB
Progress (2): 178/502 kB | 31/753 kB
Progress (2): 178/502 kB | 48/753 kB
Progress (2): 195/502 kB | 48/753 kB
Progress (2): 195/502 kB | 64/753 kB
Progress (2): 195/502 kB | 78/753 kB
Progress (2): 195/502 kB | 94/753 kB
Progress (2): 211/502 kB | 94/753 kB
Progress (2): 211/502 kB | 111/753 kB
Progress (2): 227/502 kB | 111/753 kB
Progress (2): 244/502 kB | 111/753 kB
Progress (2): 244/502 kB | 127/753 kB
Progress (2): 260/502 kB | 127/753 kB
Progress (2): 260/502 kB | 143/753 kB
Progress (2): 277/502 kB | 143/753 kB
Progress (2): 277/502 kB | 160/753 kB
Progress (2): 293/502 kB | 160/753 kB
Progress (2): 293/502 kB | 176/753 kB
Progress (2): 293/502 kB | 193/753 kB
Progress (2): 293/502 kB | 209/753 kB
Progress (2): 293/502 kB | 225/753 kB
Progress (2): 309/502 kB | 225/753 kB
Progress (2): 309/502 kB | 242/753 kB
Progress (2): 309/502 kB | 258/753 kB
Progress (2): 326/502 kB | 258/753 kB
Progress (2): 326/502 kB | 274/753 kB
Progress (2): 326/502 kB | 291/753 kB
Progress (2): 326/502 kB | 307/753 kB
Progress (2): 342/502 kB | 307/753 kB
Progress (2): 342/502 kB | 324/753 kB
Progress (2): 342/502 kB | 340/753 kB
Progress (2): 359/502 kB | 340/753 kB
Progress (2): 359/502 kB | 356/753 kB
Progress (2): 375/502 kB | 356/753 kB
Progress (2): 375/502 kB | 373/753 kB
Progress (2): 375/502 kB | 389/753 kB
Progress (2): 391/502 kB | 389/753 kB
Progress (2): 391/502 kB | 405/753 kB
Progress (2): 408/502 kB | 405/753 kB
Progress (2): 408/502 kB | 422/753 kB
Progress (2): 424/502 kB | 422/753 kB
Progress (2): 424/502 kB | 438/753 kB
Progress (2): 424/502 kB | 455/753 kB
Progress (2): 440/502 kB | 455/753 kB
Progress (2): 440/502 kB | 471/753 kB
Progress (2): 457/502 kB | 471/753 kB
Progress (2): 457/502 kB | 487/753 kB
Progress (2): 473/502 kB | 487/753 kB
Progress (2): 490/502 kB | 487/753 kB
Progress (2): 490/502 kB | 504/753 kB
Progress (2): 502 kB | 504/753 kB    
Progress (2): 502 kB | 520/753 kB
Progress (2): 502 kB | 537/753 kB
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.8.1/commons-lang3-3.8.1.jar (502 kB at 4.3 MB/s)
Progress (1): 553/753 kB
Progress (1): 569/753 kB
Progress (1): 586/753 kB
Progress (1): 602/753 kB
Progress (1): 618/753 kB
Progress (1): 635/753 kB
Progress (1): 651/753 kB
Progress (1): 668/753 kB
Progress (1): 684/753 kB
Progress (1): 700/753 kB
Progress (1): 717/753 kB
Progress (1): 733/753 kB
Progress (1): 750/753 kB
Progress (1): 753 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-collections4/4.2/commons-collections4-4.2.jar (753 kB at 6.1 MB/s)
Progress (1): 16/159 kB
Progress (1): 33/159 kB
Progress (1): 49/159 kB
Progress (1): 65/159 kB
Progress (1): 81/159 kB
Progress (1): 97/159 kB
Progress (1): 114/159 kB
Progress (1): 130/159 kB
Progress (1): 147/159 kB
Progress (1): 159 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-artifact-transfer/0.13.1/maven-artifact-transfer-0.13.1.jar (159 kB at 642 kB/s)
Progress (1): 16/37 kB
Progress (1): 33/37 kB
Progress (1): 37 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/3.0.1/maven-dependency-tree-3.0.1.jar (37 kB at 142 kB/s)
[INFO] Replacing original artifact with shaded artifact.
[INFO] Replacing /var/jenkins_home/workspace/java-cicd-clean@2/target/math-utils-1.0-SNAPSHOT.jar with /var/jenkins_home/workspace/java-cicd-clean@2/target/math-utils-1.0-SNAPSHOT-shaded.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11.130 s
[INFO] Finished at: 2025-03-28T19:15:33Z
[INFO] ------------------------------------------------------------------------
[Pipeline] }
$ docker stop --time=1 719a69651801446bd5ccecbc4263ab8961a4ad7748657040a1c75d8c41834c50
$ docker rm -f --volumes 719a69651801446bd5ccecbc4263ab8961a4ad7748657040a1c75d8c41834c50
[Pipeline] // withDockerContainer
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // node
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Test)
[Pipeline] node
Running on Jenkins in /var/jenkins_home/workspace/java-cicd-clean@2
[Pipeline] {
[Pipeline] checkout
Selected Git installation does not exist. Using Default
The recommended git tool is: NONE
No credentials specified
 > git rev-parse --resolve-git-dir /var/jenkins_home/workspace/java-cicd-clean@2/.git # timeout=10
Fetching changes from the remote Git repository
 > git config remote.origin.url https://github.com/Vinayvinnu8498/java-cicd-pipeline.git # timeout=10
Fetching upstream changes from https://github.com/Vinayvinnu8498/java-cicd-pipeline.git
 > git --version # timeout=10
 > git --version # 'git version 2.39.5'
 > git fetch --tags --force --progress -- https://github.com/Vinayvinnu8498/java-cicd-pipeline.git +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git rev-parse refs/remotes/origin/main^{commit} # timeout=10
Checking out Revision 814d50053e4e71734d43c7dc6d5b72fc9f141b27 (refs/remotes/origin/main)
 > git config core.sparsecheckout # timeout=10
 > git checkout -f 814d50053e4e71734d43c7dc6d5b72fc9f141b27 # timeout=10
Commit message: "Fix: Corrected Checkout stage to use main branch"
[Pipeline] withEnv
[Pipeline] {
[Pipeline] isUnix
[Pipeline] withEnv
[Pipeline] {
[Pipeline] sh
+ docker inspect -f . maven:3.9-eclipse-temurin-17
.
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] withDockerContainer
Jenkins seems to be running inside container 8b6f8e40e049a6cf1d996df6640be68e21631f0694a035a1c0bf2d36f1fac5c9
$ docker run -t -d -u 1000:1000 -v /root/.m2:/root/.m2 -w /var/jenkins_home/workspace/java-cicd-clean@2 --volumes-from 8b6f8e40e049a6cf1d996df6640be68e21631f0694a035a1c0bf2d36f1fac5c9 -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** -e ******** maven:3.9-eclipse-temurin-17 cat
$ docker top bdf432400e3e434a7ad44b991a11a4618aa21a314faa90b2cd51253419a89ee8 -eo pid,comm
[Pipeline] {
[Pipeline] sh
+ mvn test
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------------< com.example:math-utils >-----------------------
[INFO] Building math-utils 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/org/jacoco/jacoco-maven-plugin/0.8.8/jacoco-maven-plugin-0.8.8.pom
Progress (1): 1.4/3.8 kB
Progress (1): 2.8/3.8 kB
Progress (1): 3.8 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jacoco/jacoco-maven-plugin/0.8.8/jacoco-maven-plugin-0.8.8.pom (3.8 kB at 15 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.build/0.8.8/org.jacoco.build-0.8.8.pom
Progress (1): 1.4/44 kB
Progress (1): 2.8/44 kB
Progress (1): 4.1/44 kB
Progress (1): 5.5/44 kB
Progress (1): 6.9/44 kB
Progress (1): 8.3/44 kB
Progress (1): 9.7/44 kB
Progress (1): 11/44 kB 
Progress (1): 12/44 kB
Progress (1): 14/44 kB
Progress (1): 15/44 kB
Progress (1): 16/44 kB
Progress (1): 17/44 kB
Progress (1): 19/44 kB
Progress (1): 20/44 kB
Progress (1): 21/44 kB
Progress (1): 23/44 kB
Progress (1): 24/44 kB
Progress (1): 26/44 kB
Progress (1): 27/44 kB
Progress (1): 28/44 kB
Progress (1): 30/44 kB
Progress (1): 31/44 kB
Progress (1): 32/44 kB
Progress (1): 34/44 kB
Progress (1): 35/44 kB
Progress (1): 37/44 kB
Progress (1): 38/44 kB
Progress (1): 39/44 kB
Progress (1): 41/44 kB
Progress (1): 42/44 kB
Progress (1): 43/44 kB
Progress (1): 44 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.build/0.8.8/org.jacoco.build-0.8.8.pom (44 kB at 968 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jacoco/jacoco-maven-plugin/0.8.8/jacoco-maven-plugin-0.8.8.jar
Progress (1): 16/56 kB
Progress (1): 33/56 kB
Progress (1): 49/56 kB
Progress (1): 56 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/jacoco/jacoco-maven-plugin/0.8.8/jacoco-maven-plugin-0.8.8.jar (56 kB at 2.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.3.1/maven-resources-plugin-3.3.1.pom
Progress (1): 8.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.3.1/maven-resources-plugin-3.3.1.pom (8.2 kB at 480 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/39/maven-plugins-39.pom
Progress (1): 8.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/39/maven-plugins-39.pom (8.1 kB at 578 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/39/maven-parent-39.pom
Progress (1): 16/48 kB
Progress (1): 33/48 kB
Progress (1): 48 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/39/maven-parent-39.pom (48 kB at 2.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/29/apache-29.pom
Progress (1): 16/21 kB
Progress (1): 21 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/29/apache-29.pom (21 kB at 1.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.3.1/maven-resources-plugin-3.3.1.jar
Progress (1): 16/31 kB
Progress (1): 31 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.3.1/maven-resources-plugin-3.3.1.jar (31 kB at 2.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.8.1/maven-compiler-plugin-3.8.1.pom
Progress (1): 12 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.8.1/maven-compiler-plugin-3.8.1.pom (12 kB at 656 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/33/maven-plugins-33.pom
Progress (1): 11 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/33/maven-plugins-33.pom (11 kB at 822 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/33/maven-parent-33.pom
Progress (1): 16/44 kB
Progress (1): 33/44 kB
Progress (1): 44 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/33/maven-parent-33.pom (44 kB at 2.8 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/21/apache-21.pom
Progress (1): 16/17 kB
Progress (1): 17 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/21/apache-21.pom (17 kB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.8.1/maven-compiler-plugin-3.8.1.jar
Progress (1): 16/62 kB
Progress (1): 32/62 kB
Progress (1): 49/62 kB
Progress (1): 62 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.8.1/maven-compiler-plugin-3.8.1.jar (62 kB at 2.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.22.2/maven-surefire-plugin-2.22.2.pom
Progress (1): 5.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.22.2/maven-surefire-plugin-2.22.2.pom (5.0 kB at 100 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire/2.22.2/surefire-2.22.2.pom
Progress (1): 16/26 kB
Progress (1): 26 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire/2.22.2/surefire-2.22.2.pom (26 kB at 1.6 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.22.2/maven-surefire-plugin-2.22.2.jar
Progress (1): 16/41 kB
Progress (1): 32/41 kB
Progress (1): 41 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.22.2/maven-surefire-plugin-2.22.2.jar (41 kB at 779 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/5.7.0/junit-jupiter-engine-5.7.0.pom
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/5.7.0/junit-jupiter-engine-5.7.0.pom (3.2 kB at 178 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.0/junit-bom-5.7.0.pom
Progress (1): 5.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.0/junit-bom-5.7.0.pom (5.1 kB at 283 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.pom
Progress (1): 1.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.pom (1.2 kB at 97 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.7.0/junit-platform-engine-1.7.0.pom
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.7.0/junit-platform-engine-1.7.0.pom (3.2 kB at 168 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.pom
Progress (1): 1.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.pom (1.7 kB at 129 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.7.0/junit-platform-commons-1.7.0.pom
Progress (1): 2.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.7.0/junit-platform-commons-1.7.0.pom (2.8 kB at 157 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.7.0/junit-jupiter-api-5.7.0.pom
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.7.0/junit-jupiter-api-5.7.0.pom (3.2 kB at 199 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/5.7.0/junit-jupiter-engine-5.7.0.jar
Progress (1): 16/212 kB
Progress (1): 33/212 kB
Progress (1): 49/212 kB
Progress (1): 66/212 kB
Progress (1): 82/212 kB
Progress (1): 98/212 kB
Progress (1): 115/212 kB
Progress (1): 131/212 kB
Progress (1): 147/212 kB
Progress (1): 164/212 kB
Progress (1): 180/212 kB
Progress (1): 197/212 kB
Progress (1): 212 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/5.7.0/junit-jupiter-engine-5.7.0.jar (212 kB at 6.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.7.0/junit-platform-engine-1.7.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.7.0/junit-platform-commons-1.7.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.7.0/junit-jupiter-api-5.7.0.jar
Progress (1): 16/181 kB
Progress (1): 32/181 kB
Progress (1): 49/181 kB
Progress (1): 65/181 kB
Progress (1): 81/181 kB
Progress (1): 98/181 kB
Progress (1): 114/181 kB
Progress (1): 130/181 kB
Progress (1): 147/181 kB
Progress (1): 163/181 kB
Progress (2): 163/181 kB | 1.4/7.7 kB
Progress (2): 163/181 kB | 2.8/7.7 kB
Progress (2): 163/181 kB | 4.1/7.7 kB
Progress (2): 163/181 kB | 5.5/7.7 kB
Progress (2): 163/181 kB | 6.9/7.7 kB
Progress (2): 163/181 kB | 7.7 kB    
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar (7.7 kB at 163 kB/s)
Progress (1): 180/181 kB
Progress (1): 181 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.7.0/junit-platform-engine-1.7.0.jar (181 kB at 3.6 MB/s)
Progress (1): 16/100 kB
Progress (2): 16/100 kB | 16/175 kB
Progress (2): 33/100 kB | 16/175 kB
Progress (2): 33/100 kB | 33/175 kB
Progress (2): 33/100 kB | 49/175 kB
Progress (2): 49/100 kB | 49/175 kB
Progress (2): 49/100 kB | 66/175 kB
Progress (2): 66/100 kB | 66/175 kB
Progress (2): 66/100 kB | 82/175 kB
Progress (2): 82/100 kB | 82/175 kB
Progress (2): 82/100 kB | 98/175 kB
Progress (2): 98/100 kB | 98/175 kB
Progress (2): 100 kB | 98/175 kB   
Progress (2): 100 kB | 115/175 kB
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.7.0/junit-platform-commons-1.7.0.jar (100 kB at 1.1 MB/s)
Progress (1): 131/175 kB
Progress (1): 147/175 kB
Progress (1): 164/175 kB
Progress (1): 175 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.7.0/junit-jupiter-api-5.7.0.jar (175 kB at 1.8 MB/s)
Progress (1): 1.4/2.4 kB
Progress (1): 2.4 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.jar (2.4 kB at 8.9 kB/s)
[INFO] 
[INFO] --- jacoco:0.8.8:prepare-agent (default) @ math-utils ---
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.22/plexus-utils-3.0.22.pom
Progress (1): 1.4/3.8 kB
Progress (1): 2.8/3.8 kB
Progress (1): 3.8 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.22/plexus-utils-3.0.22.pom (3.8 kB at 255 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.3.1/plexus-3.3.1.pom
Progress (1): 1.4/20 kB
Progress (1): 2.8/20 kB
Progress (1): 4.1/20 kB
Progress (1): 5.5/20 kB
Progress (1): 6.9/20 kB
Progress (1): 8.3/20 kB
Progress (1): 9.7/20 kB
Progress (1): 11/20 kB 
Progress (1): 12/20 kB
Progress (1): 14/20 kB
Progress (1): 15/20 kB
Progress (1): 17/20 kB
Progress (1): 18/20 kB
Progress (1): 19/20 kB
Progress (1): 20 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.3.1/plexus-3.3.1.pom (20 kB at 1.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/17/spice-parent-17.pom
Progress (1): 1.4/6.8 kB
Progress (1): 2.8/6.8 kB
Progress (1): 4.1/6.8 kB
Progress (1): 5.5/6.8 kB
Progress (1): 6.8 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/17/spice-parent-17.pom (6.8 kB at 398 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/10/forge-parent-10.pom
Progress (1): 1.4/14 kB
Progress (1): 2.8/14 kB
Progress (1): 4.1/14 kB
Progress (1): 5.5/14 kB
Progress (1): 6.9/14 kB
Progress (1): 8.3/14 kB
Progress (1): 9.7/14 kB
Progress (1): 11/14 kB 
Progress (1): 12/14 kB
Progress (1): 14 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/10/forge-parent-10.pom (14 kB at 590 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/1.2.1/file-management-1.2.1.pom
Progress (1): 1.4/3.9 kB
Progress (1): 2.8/3.9 kB
Progress (1): 3.9 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/1.2.1/file-management-1.2.1.pom (3.9 kB at 176 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/10/maven-shared-components-10.pom
Progress (1): 1.4/8.4 kB
Progress (1): 2.8/8.4 kB
Progress (1): 4.1/8.4 kB
Progress (1): 5.5/8.4 kB
Progress (1): 6.9/8.4 kB
Progress (1): 8.3/8.4 kB
Progress (1): 8.4 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/10/maven-shared-components-10.pom (8.4 kB at 468 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/9/maven-parent-9.pom
Progress (1): 16/33 kB
Progress (1): 33/33 kB
Progress (1): 33 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/9/maven-parent-9.pom (33 kB at 1.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/4/apache-4.pom
Progress (1): 4.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/4/apache-4.pom (4.5 kB at 409 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.6/maven-plugin-api-2.0.6.pom
Progress (1): 1.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.6/maven-plugin-api-2.0.6.pom (1.5 kB at 81 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.0.6/maven-2.0.6.pom
Progress (1): 9.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.0.6/maven-2.0.6.pom (9.0 kB at 411 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/5/maven-parent-5.pom
Progress (1): 15 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/5/maven-parent-5.pom (15 kB at 846 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/3/apache-3.pom
Progress (1): 3.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/3/apache-3.pom (3.4 kB at 286 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-io/1.1/maven-shared-io-1.1.pom
Progress (1): 4.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-io/1.1/maven-shared-io-1.1.pom (4.1 kB at 338 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/8/maven-shared-components-8.pom
Progress (1): 2.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/8/maven-shared-components-8.pom (2.7 kB at 141 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/7/maven-parent-7.pom
Progress (1): 16/21 kB
Progress (1): 21 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/7/maven-parent-7.pom (21 kB at 817 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.2/maven-artifact-2.0.2.pom
Progress (1): 765 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.2/maven-artifact-2.0.2.pom (765 B at 27 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.0.2/maven-2.0.2.pom
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.0.2/maven-2.0.2.pom (13 kB at 823 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.1/plexus-utils-1.1.pom
Progress (1): 767 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.1/plexus-utils-1.1.pom (767 B at 48 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.4/plexus-1.0.4.pom
Progress (1): 5.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.4/plexus-1.0.4.pom (5.7 kB at 441 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.0.2/maven-artifact-manager-2.0.2.pom
Progress (1): 1.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.0.2/maven-artifact-manager-2.0.2.pom (1.4 kB at 87 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.2/maven-repository-metadata-2.0.2.pom
Progress (1): 1.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.2/maven-repository-metadata-2.0.2.pom (1.3 kB at 119 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9/plexus-container-default-1.0-alpha-9.pom
Progress (1): 1.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9/plexus-container-default-1.0-alpha-9.pom (1.2 kB at 103 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.0.3/plexus-containers-1.0.3.pom
Progress (1): 492 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.0.3/plexus-containers-1.0.3.pom (492 B at 22 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/junit/junit/4.13.1/junit-4.13.1.pom
Progress (1): 16/25 kB
Progress (1): 25 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/junit/junit/4.13.1/junit-4.13.1.pom (25 kB at 1.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.pom
Progress (1): 766 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.pom (766 B at 70 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-parent/1.3/hamcrest-parent-1.3.pom
Progress (1): 2.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-parent/1.3/hamcrest-parent-1.3.pom (2.0 kB at 94 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.0.4/plexus-utils-1.0.4.pom
Progress (1): 6.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.0.4/plexus-utils-1.0.4.pom (6.9 kB at 623 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1-alpha-2/classworlds-1.1-alpha-2.pom
Progress (1): 3.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1-alpha-2/classworlds-1.1-alpha-2.pom (3.1 kB at 261 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/1.0-alpha-6/wagon-provider-api-1.0-alpha-6.pom
Progress (1): 588 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/1.0-alpha-6/wagon-provider-api-1.0-alpha-6.pom (588 B at 45 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon/1.0-alpha-6/wagon-1.0-alpha-6.pom
Progress (1): 6.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon/1.0-alpha-6/wagon-1.0-alpha-6.pom (6.4 kB at 493 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.4.6/plexus-utils-1.4.6.pom
Progress (1): 2.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.4.6/plexus-utils-1.4.6.pom (2.3 kB at 174 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.11/plexus-1.0.11.pom
Progress (1): 9.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.11/plexus-1.0.11.pom (9.0 kB at 690 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.6/plexus-utils-1.5.6.pom
Progress (1): 5.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.6/plexus-utils-1.5.6.pom (5.3 kB at 331 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.12/plexus-1.0.12.pom
Progress (1): 9.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.12/plexus-1.0.12.pom (9.8 kB at 700 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.pom
Progress (1): 2.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.pom (2.4 kB at 216 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/15/maven-shared-components-15.pom
Progress (1): 9.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/15/maven-shared-components-15.pom (9.3 kB at 849 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/16/maven-parent-16.pom
Progress (1): 16/23 kB
Progress (1): 23 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/16/maven-parent-16.pom (23 kB at 1.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/7/apache-7.pom
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/7/apache-7.pom (14 kB at 962 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.0/doxia-sink-api-1.0.pom
Progress (1): 1.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.0/doxia-sink-api-1.0.pom (1.4 kB at 58 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.0/doxia-1.0.pom
Progress (1): 9.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.0/doxia-1.0.pom (9.6 kB at 742 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/10/maven-parent-10.pom
Progress (1): 16/32 kB
Progress (1): 32 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/10/maven-parent-10.pom (32 kB at 2.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.agent/0.8.8/org.jacoco.agent-0.8.8.pom
Progress (1): 3.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.agent/0.8.8/org.jacoco.agent-0.8.8.pom (3.5 kB at 233 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.core/0.8.8/org.jacoco.core-0.8.8.pom
Progress (1): 2.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.core/0.8.8/org.jacoco.core-0.8.8.pom (2.1 kB at 174 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.2/asm-9.2.pom
Progress (1): 2.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.2/asm-9.2.pom (2.4 kB at 158 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/ow2/1.5/ow2-1.5.pom
Progress (1): 11 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/ow2/1.5/ow2-1.5.pom (11 kB at 1.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.2/asm-commons-9.2.pom
Progress (1): 3.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.2/asm-commons-9.2.pom (3.0 kB at 156 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.2/asm-tree-9.2.pom
Progress (1): 2.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.2/asm-tree-9.2.pom (2.6 kB at 216 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-analysis/9.2/asm-analysis-9.2.pom
Progress (1): 2.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-analysis/9.2/asm-analysis-9.2.pom (2.6 kB at 238 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.report/0.8.8/org.jacoco.report-0.8.8.pom
Progress (1): 1.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.report/0.8.8/org.jacoco.report-0.8.8.pom (1.9 kB at 145 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.22/plexus-utils-3.0.22.jar
Progress (1): 16/245 kB
Progress (1): 33/245 kB
Progress (1): 49/245 kB
Progress (1): 66/245 kB
Progress (1): 82/245 kB
Progress (1): 98/245 kB
Progress (1): 115/245 kB
Progress (1): 131/245 kB
Progress (1): 147/245 kB
Progress (1): 164/245 kB
Progress (1): 180/245 kB
Progress (1): 197/245 kB
Progress (1): 213/245 kB
Progress (1): 229/245 kB
Progress (1): 245 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.22/plexus-utils-3.0.22.jar (245 kB at 6.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/1.2.1/file-management-1.2.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.6/maven-plugin-api-2.0.6.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-io/1.1/maven-shared-io-1.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.2/maven-artifact-2.0.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.0.2/maven-artifact-manager-2.0.2.jar
Progress (1): 16/39 kB
Progress (1): 33/39 kB
Progress (2): 33/39 kB | 13 kB
Progress (3): 33/39 kB | 13 kB | 1.4/78 kB
Progress (3): 33/39 kB | 13 kB | 2.8/78 kB
Progress (3): 33/39 kB | 13 kB | 4.1/78 kB
Progress (3): 39 kB | 13 kB | 4.1/78 kB   
Progress (3): 39 kB | 13 kB | 5.5/78 kB
Progress (3): 39 kB | 13 kB | 6.9/78 kB
Progress (3): 39 kB | 13 kB | 8.3/78 kB
                                       
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-io/1.1/maven-shared-io-1.1.jar (39 kB at 1.5 MB/s)
Progress (2): 13 kB | 9.7/78 kB
                               
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.2/maven-repository-metadata-2.0.2.jar
Progress (2): 13 kB | 11/78 kB
Progress (2): 13 kB | 12/78 kB
Progress (2): 13 kB | 14/78 kB
Progress (2): 13 kB | 15/78 kB
Progress (2): 13 kB | 16/78 kB
Progress (3): 13 kB | 16/78 kB | 16/49 kB
Progress (3): 13 kB | 16/78 kB | 32/49 kB
Progress (3): 13 kB | 32/78 kB | 32/49 kB
Progress (3): 13 kB | 49/78 kB | 32/49 kB
Progress (3): 13 kB | 65/78 kB | 32/49 kB
Progress (3): 13 kB | 78 kB | 32/49 kB   
Progress (3): 13 kB | 78 kB | 49/49 kB
Progress (3): 13 kB | 78 kB | 49 kB   
                                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.0.2/maven-artifact-manager-2.0.2.jar (49 kB at 1.2 MB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.0.2/maven-artifact-2.0.2.jar (78 kB at 1.9 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/1.0-alpha-6/wagon-provider-api-1.0-alpha-6.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9/plexus-container-default-1.0-alpha-9.jar
Progress (2): 13 kB | 16/20 kB
Progress (2): 13 kB | 20 kB   
                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.0.2/maven-repository-metadata-2.0.2.jar (20 kB at 458 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/junit/junit/4.13.1/junit-4.13.1.jar
Progress (2): 13 kB | 16/43 kB
Progress (2): 13 kB | 33/43 kB
Progress (2): 13 kB | 43 kB   
                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/1.0-alpha-6/wagon-provider-api-1.0-alpha-6.jar (43 kB at 737 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar
Progress (2): 13 kB | 16/383 kB
Progress (2): 13 kB | 33/383 kB
Progress (2): 13 kB | 49/383 kB
Progress (2): 13 kB | 66/383 kB
Progress (2): 13 kB | 82/383 kB
Progress (2): 13 kB | 98/383 kB
Progress (2): 13 kB | 115/383 kB
Progress (2): 13 kB | 131/383 kB
Progress (3): 13 kB | 131/383 kB | 16/45 kB
Progress (3): 13 kB | 131/383 kB | 32/45 kB
Progress (3): 13 kB | 147/383 kB | 32/45 kB
Progress (3): 13 kB | 147/383 kB | 45 kB   
Progress (3): 13 kB | 164/383 kB | 45 kB
                                        
Downloaded from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar (45 kB at 542 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1-alpha-2/classworlds-1.1-alpha-2.jar
Progress (2): 13 kB | 180/383 kB
Progress (2): 13 kB | 197/383 kB
Progress (2): 13 kB | 213/383 kB
Progress (2): 13 kB | 229/383 kB
Progress (2): 13 kB | 246/383 kB
Progress (2): 13 kB | 262/383 kB
Progress (2): 13 kB | 279/383 kB
Progress (2): 13 kB | 295/383 kB
Progress (2): 13 kB | 311/383 kB
Progress (2): 13 kB | 328/383 kB
Progress (2): 13 kB | 344/383 kB
Progress (2): 13 kB | 360/383 kB
Progress (3): 13 kB | 360/383 kB | 16/38 kB
Progress (3): 13 kB | 360/383 kB | 32/38 kB
Progress (3): 13 kB | 360/383 kB | 38 kB   
                                        
Downloaded from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1-alpha-2/classworlds-1.1-alpha-2.jar (38 kB at 368 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.jar
Progress (2): 13 kB | 377/383 kB
Progress (2): 13 kB | 383 kB    
                            
Downloaded from central: https://repo.maven.apache.org/maven2/junit/junit/4.13.1/junit-4.13.1.jar (383 kB at 3.6 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.0/doxia-sink-api-1.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.6/maven-plugin-api-2.0.6.jar (13 kB at 117 kB/s)
Progress (1): 16/38 kB
                      
Downloading from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.agent/0.8.8/org.jacoco.agent-0.8.8-runtime.jar
Progress (1): 33/38 kB
Progress (1): 38 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/1.2.1/file-management-1.2.1.jar (38 kB at 339 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.core/0.8.8/org.jacoco.core-0.8.8.jar
Progress (1): 11 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.jar (11 kB at 99 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.2/asm-9.2.jar
Progress (1): 10 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.0/doxia-sink-api-1.0.jar (10 kB at 87 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.2/asm-commons-9.2.jar
Progress (1): 16/122 kB
Progress (1): 32/122 kB
Progress (1): 49/122 kB
Progress (2): 49/122 kB | 16/293 kB
Progress (3): 49/122 kB | 16/293 kB | 16/203 kB
Progress (3): 49/122 kB | 16/293 kB | 33/203 kB
Progress (3): 65/122 kB | 16/293 kB | 33/203 kB
Progress (3): 65/122 kB | 16/293 kB | 49/203 kB
Progress (3): 81/122 kB | 16/293 kB | 49/203 kB
Progress (3): 98/122 kB | 16/293 kB | 49/203 kB
Progress (4): 98/122 kB | 16/293 kB | 49/203 kB | 16/73 kB
Progress (4): 98/122 kB | 16/293 kB | 49/203 kB | 33/73 kB
Progress (4): 114/122 kB | 16/293 kB | 49/203 kB | 33/73 kB
Progress (4): 114/122 kB | 16/293 kB | 66/203 kB | 33/73 kB
Progress (4): 114/122 kB | 16/293 kB | 82/203 kB | 33/73 kB
Progress (4): 114/122 kB | 16/293 kB | 82/203 kB | 49/73 kB
Progress (4): 122 kB | 16/293 kB | 82/203 kB | 49/73 kB    
Progress (4): 122 kB | 16/293 kB | 82/203 kB | 66/73 kB
Progress (4): 122 kB | 16/293 kB | 82/203 kB | 73 kB   
                                                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.2/asm-9.2.jar (122 kB at 859 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-analysis/9.2/asm-analysis-9.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.2/asm-commons-9.2.jar (73 kB at 512 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.2/asm-tree-9.2.jar
Progress (2): 33/293 kB | 82/203 kB
Progress (2): 33/293 kB | 98/203 kB
Progress (2): 33/293 kB | 115/203 kB
Progress (2): 33/293 kB | 131/203 kB
Progress (2): 49/293 kB | 131/203 kB
Progress (2): 66/293 kB | 131/203 kB
Progress (2): 66/293 kB | 147/203 kB
Progress (2): 82/293 kB | 147/203 kB
Progress (2): 82/293 kB | 164/203 kB
Progress (2): 82/293 kB | 180/203 kB
Progress (2): 82/293 kB | 197/203 kB
Progress (2): 82/293 kB | 203 kB    
                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.core/0.8.8/org.jacoco.core-0.8.8.jar (203 kB at 1.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.report/0.8.8/org.jacoco.report-0.8.8.jar
Progress (1): 98/293 kB
Progress (2): 98/293 kB | 16/34 kB
Progress (2): 98/293 kB | 33/34 kB
Progress (2): 98/293 kB | 34 kB   
                               
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-analysis/9.2/asm-analysis-9.2.jar (34 kB at 215 kB/s)
Progress (2): 98/293 kB | 16/53 kB
Progress (2): 115/293 kB | 16/53 kB
Progress (2): 131/293 kB | 16/53 kB
Progress (2): 147/293 kB | 16/53 kB
Progress (2): 147/293 kB | 32/53 kB
Progress (2): 147/293 kB | 49/53 kB
Progress (2): 147/293 kB | 53 kB   
                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.2/asm-tree-9.2.jar (53 kB at 310 kB/s)
Progress (1): 164/293 kB
Progress (1): 180/293 kB
Progress (2): 180/293 kB | 16/129 kB
Progress (2): 197/293 kB | 16/129 kB
Progress (2): 197/293 kB | 32/129 kB
Progress (2): 197/293 kB | 49/129 kB
Progress (2): 213/293 kB | 49/129 kB
Progress (2): 213/293 kB | 65/129 kB
Progress (2): 229/293 kB | 65/129 kB
Progress (2): 246/293 kB | 65/129 kB
Progress (2): 246/293 kB | 81/129 kB
Progress (2): 262/293 kB | 81/129 kB
Progress (2): 279/293 kB | 81/129 kB
Progress (2): 279/293 kB | 98/129 kB
Progress (2): 279/293 kB | 114/129 kB
Progress (2): 279/293 kB | 129 kB    
Progress (2): 293 kB | 129 kB    
                             
Downloaded from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.report/0.8.8/org.jacoco.report-0.8.8.jar (129 kB at 689 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/jacoco/org.jacoco.agent/0.8.8/org.jacoco.agent-0.8.8-runtime.jar (293 kB at 1.6 MB/s)
Progress (1): 16/195 kB
Progress (1): 33/195 kB
Progress (1): 49/195 kB
Progress (1): 66/195 kB
Progress (1): 82/195 kB
Progress (1): 98/195 kB
Progress (1): 115/195 kB
Progress (1): 131/195 kB
Progress (1): 147/195 kB
Progress (1): 164/195 kB
Progress (1): 180/195 kB
Progress (1): 195 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9/plexus-container-default-1.0-alpha-9.jar (195 kB at 669 kB/s)
[INFO] argLine set to -javaagent:/home/ubuntu/.m2/repository/org/jacoco/org.jacoco.agent/0.8.8/org.jacoco.agent-0.8.8-runtime.jar=destfile=/var/jenkins_home/workspace/java-cicd-clean@2/target/jacoco.exec
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ math-utils ---
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.pom
Progress (1): 2.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.pom (2.7 kB at 204 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/5.1/plexus-5.1.pom
Progress (1): 16/23 kB
Progress (1): 23 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/5.1/plexus-5.1.pom (23 kB at 1.6 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.pom
Progress (1): 8.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.pom (8.8 kB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/10/plexus-10.pom
Progress (1): 16/25 kB
Progress (1): 25 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/10/plexus-10.pom (25 kB at 2.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.3.1/maven-filtering-3.3.1.pom
Progress (1): 6.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.3.1/maven-filtering-3.3.1.pom (6.0 kB at 549 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/39/maven-shared-components-39.pom
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/39/maven-shared-components-39.pom (3.2 kB at 248 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.pom
Progress (1): 612 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.pom (612 B at 44 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.pom
Progress (1): 2.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.pom (2.7 kB at 229 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.36/slf4j-parent-1.7.36.pom
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.36/slf4j-parent-1.7.36.pom (14 kB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.pom
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.pom (3.2 kB at 356 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/15/spice-parent-15.pom
Progress (1): 8.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/15/spice-parent-15.pom (8.4 kB at 1.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/5/forge-parent-5.pom
Progress (1): 8.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/5/forge-parent-5.pom (8.4 kB at 558 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.0/plexus-utils-3.5.0.pom
Progress (1): 8.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.0/plexus-utils-3.5.0.pom (8.0 kB at 534 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.pom
Progress (1): 16/20 kB
Progress (1): 20 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.pom (20 kB at 1.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/52/commons-parent-52.pom
Progress (1): 16/79 kB
Progress (1): 33/79 kB
Progress (1): 49/79 kB
Progress (1): 66/79 kB
Progress (1): 79 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/52/commons-parent-52.pom (79 kB at 4.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/23/apache-23.pom
Progress (1): 16/18 kB
Progress (1): 18 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/23/apache-23.pom (18 kB at 1.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.2/junit-bom-5.7.2.pom
Progress (1): 5.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.2/junit-bom-5.7.2.pom (5.1 kB at 300 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.pom
Progress (1): 16/31 kB
Progress (1): 31 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.pom (31 kB at 2.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.1/junit-bom-5.7.1.pom
Progress (1): 5.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.1/junit-bom-5.7.1.pom (5.1 kB at 392 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.jar
Progress (1): 16/85 kB
Progress (1): 33/85 kB
Progress (1): 49/85 kB
Progress (1): 66/85 kB
Progress (1): 82/85 kB
Progress (1): 85 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.jar (85 kB at 5.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.3.1/maven-filtering-3.3.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.jar
Progress (1): 2.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar (2.5 kB at 250 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.jar
Progress (1): 16/41 kB
Progress (2): 16/41 kB | 16/269 kB
Progress (2): 16/41 kB | 33/269 kB
Progress (2): 33/41 kB | 33/269 kB
Progress (2): 41 kB | 33/269 kB   
                               
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar (41 kB at 2.9 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.jar
Progress (1): 49/269 kB
Progress (2): 49/269 kB | 8.5 kB
                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.jar (8.5 kB at 530 kB/s)
Progress (2): 49/269 kB | 16/55 kB
Progress (2): 62/269 kB | 16/55 kB
Progress (2): 78/269 kB | 16/55 kB
Progress (2): 78/269 kB | 33/55 kB
Progress (3): 78/269 kB | 33/55 kB | 16/587 kB
Progress (3): 78/269 kB | 49/55 kB | 16/587 kB
Progress (3): 78/269 kB | 55 kB | 16/587 kB   
Progress (3): 78/269 kB | 55 kB | 33/587 kB
                                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.3.1/maven-filtering-3.3.1.jar (55 kB at 1.8 MB/s)
Progress (2): 78/269 kB | 49/587 kB
Progress (2): 78/269 kB | 62/587 kB
Progress (3): 78/269 kB | 62/587 kB | 16/327 kB
Progress (3): 94/269 kB | 62/587 kB | 16/327 kB
Progress (3): 111/269 kB | 62/587 kB | 16/327 kB
Progress (3): 111/269 kB | 62/587 kB | 33/327 kB
Progress (3): 127/269 kB | 62/587 kB | 33/327 kB
Progress (3): 127/269 kB | 62/587 kB | 49/327 kB
Progress (3): 127/269 kB | 62/587 kB | 66/327 kB
Progress (3): 127/269 kB | 78/587 kB | 66/327 kB
Progress (3): 127/269 kB | 78/587 kB | 82/327 kB
Progress (3): 127/269 kB | 95/587 kB | 82/327 kB
Progress (3): 144/269 kB | 95/587 kB | 82/327 kB
Progress (3): 160/269 kB | 95/587 kB | 82/327 kB
Progress (3): 160/269 kB | 95/587 kB | 98/327 kB
Progress (3): 160/269 kB | 111/587 kB | 98/327 kB
Progress (3): 176/269 kB | 111/587 kB | 98/327 kB
Progress (3): 193/269 kB | 111/587 kB | 98/327 kB
Progress (3): 193/269 kB | 128/587 kB | 98/327 kB
Progress (3): 209/269 kB | 128/587 kB | 98/327 kB
Progress (3): 225/269 kB | 128/587 kB | 98/327 kB
Progress (3): 225/269 kB | 128/587 kB | 115/327 kB
Progress (3): 242/269 kB | 128/587 kB | 115/327 kB
Progress (3): 258/269 kB | 128/587 kB | 115/327 kB
Progress (3): 258/269 kB | 144/587 kB | 115/327 kB
Progress (3): 258/269 kB | 144/587 kB | 131/327 kB
Progress (3): 258/269 kB | 160/587 kB | 131/327 kB
Progress (3): 269 kB | 160/587 kB | 131/327 kB    
                                              
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.jar (269 kB at 4.6 MB/s)
Progress (2): 177/587 kB | 131/327 kB
Progress (2): 177/587 kB | 147/327 kB
Progress (2): 193/587 kB | 147/327 kB
Progress (2): 193/587 kB | 164/327 kB
Progress (2): 209/587 kB | 164/327 kB
Progress (2): 209/587 kB | 180/327 kB
Progress (2): 226/587 kB | 180/327 kB
Progress (2): 226/587 kB | 197/327 kB
Progress (2): 226/587 kB | 213/327 kB
Progress (2): 242/587 kB | 213/327 kB
Progress (2): 242/587 kB | 229/327 kB
Progress (2): 259/587 kB | 229/327 kB
Progress (2): 259/587 kB | 246/327 kB
Progress (2): 275/587 kB | 246/327 kB
Progress (2): 291/587 kB | 246/327 kB
Progress (2): 291/587 kB | 262/327 kB
Progress (2): 291/587 kB | 279/327 kB
Progress (2): 308/587 kB | 279/327 kB
Progress (2): 324/587 kB | 279/327 kB
Progress (2): 324/587 kB | 295/327 kB
Progress (2): 341/587 kB | 295/327 kB
Progress (2): 341/587 kB | 311/327 kB
Progress (2): 357/587 kB | 311/327 kB
Progress (2): 373/587 kB | 311/327 kB
Progress (2): 373/587 kB | 327 kB    
Progress (2): 390/587 kB | 327 kB
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.jar (327 kB at 4.2 MB/s)
Progress (1): 406/587 kB
Progress (1): 422/587 kB
Progress (1): 439/587 kB
Progress (1): 455/587 kB
Progress (1): 472/587 kB
Progress (1): 488/587 kB
Progress (1): 504/587 kB
Progress (1): 521/587 kB
Progress (1): 537/587 kB
Progress (1): 554/587 kB
Progress (1): 570/587 kB
Progress (1): 586/587 kB
Progress (1): 587 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.jar (587 kB at 6.5 MB/s)
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /var/jenkins_home/workspace/java-cicd-clean@2/src/main/resources
[INFO] 
[INFO] --- compiler:3.8.1:compile (default-compile) @ math-utils ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.pom
Progress (1): 2.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.pom (2.3 kB at 176 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.0/maven-3.0.pom
Progress (1): 16/22 kB
Progress (1): 22 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.0/maven-3.0.pom (22 kB at 2.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/15/maven-parent-15.pom
Progress (1): 16/24 kB
Progress (1): 24 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/15/maven-parent-15.pom (24 kB at 1.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/6/apache-6.pom
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/6/apache-6.pom (13 kB at 984 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.pom
Progress (1): 3.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.pom (3.9 kB at 299 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.4/plexus-utils-2.0.4.pom
Progress (1): 3.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.4/plexus-utils-2.0.4.pom (3.3 kB at 278 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.6/plexus-2.0.6.pom
Progress (1): 16/17 kB
Progress (1): 17 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.6/plexus-2.0.6.pom (17 kB at 1.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.pom
Progress (1): 1.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.pom (1.9 kB at 138 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.pom
Progress (1): 5.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.pom (5.4 kB at 413 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-plexus/1.4.2/guice-plexus-1.4.2.pom
Progress (1): 3.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-plexus/1.4.2/guice-plexus-1.4.2.pom (3.1 kB at 261 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-bean/1.4.2/guice-bean-1.4.2.pom
Progress (1): 2.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-bean/1.4.2/guice-bean-1.4.2.pom (2.6 kB at 186 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject/1.4.2/sisu-inject-1.4.2.pom
Progress (1): 1.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject/1.4.2/sisu-inject-1.4.2.pom (1.2 kB at 66 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-parent/1.4.2/sisu-parent-1.4.2.pom
Progress (1): 7.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-parent/1.4.2/sisu-parent-1.4.2.pom (7.8 kB at 778 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/6/forge-parent-6.pom
Progress (1): 11 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/6/forge-parent-6.pom (11 kB at 1.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.7.1/plexus-component-annotations-1.7.1.pom
Progress (1): 770 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.7.1/plexus-component-annotations-1.7.1.pom (770 B at 70 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.7.1/plexus-containers-1.7.1.pom
Progress (1): 5.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.7.1/plexus-containers-1.7.1.pom (5.0 kB at 419 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/4.0/plexus-4.0.pom
Progress (1): 16/22 kB
Progress (1): 22 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/4.0/plexus-4.0.pom (22 kB at 977 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.pom
Progress (1): 4.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.pom (4.0 kB at 333 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.5/plexus-utils-2.0.5.pom
Progress (1): 3.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.5/plexus-utils-2.0.5.pom (3.3 kB at 238 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.pom
Progress (1): 5.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.pom (5.5 kB at 248 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7.pom
Progress (1): 11 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7.pom (11 kB at 299 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.pom
Progress (1): 6.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.pom (6.6 kB at 237 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.0/maven-settings-3.0.pom
Progress (1): 1.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.0/maven-settings-3.0.pom (1.9 kB at 134 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.pom
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.pom (2.2 kB at 106 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.pom
Progress (1): 910 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.pom (910 B at 76 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.18/plexus-components-1.1.18.pom
Progress (1): 5.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.18/plexus-components-1.1.18.pom (5.4 kB at 298 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.7/plexus-2.0.7.pom
Progress (1): 16/17 kB
Progress (1): 17 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.7/plexus-2.0.7.pom (17 kB at 596 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.pom
Progress (1): 3.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.pom (3.0 kB at 228 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/12/spice-parent-12.pom
Progress (1): 6.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/12/spice-parent-12.pom (6.8 kB at 680 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/4/forge-parent-4.pom
Progress (1): 8.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/4/forge-parent-4.pom (8.4 kB at 600 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.5/plexus-utils-1.5.5.pom
Progress (1): 5.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.5/plexus-utils-1.5.5.pom (5.1 kB at 468 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.pom
Progress (1): 2.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.pom (2.1 kB at 159 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.pom
Progress (1): 1.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.pom (1.9 kB at 193 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.pom
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.pom (2.2 kB at 173 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.pom
Progress (1): 2.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.pom (2.5 kB at 190 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.pom
Progress (1): 1.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.pom (1.7 kB at 139 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-parent/1.7/aether-parent-1.7.pom
Progress (1): 7.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-parent/1.7/aether-parent-1.7.pom (7.7 kB at 454 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.pom
Progress (1): 2.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.pom (2.1 kB at 94 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.pom
Progress (1): 3.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.pom (3.7 kB at 308 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.pom
Progress (1): 1.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.pom (1.7 kB at 145 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.2.1/maven-shared-utils-3.2.1.pom
Progress (1): 5.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.2.1/maven-shared-utils-3.2.1.pom (5.6 kB at 433 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/30/maven-shared-components-30.pom
Progress (1): 4.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/30/maven-shared-components-30.pom (4.6 kB at 417 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/30/maven-parent-30.pom
Progress (1): 16/41 kB
Progress (1): 33/41 kB
Progress (1): 41 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/30/maven-parent-30.pom (41 kB at 2.8 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/18/apache-18.pom
Progress (1): 16 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/18/apache-18.pom (16 kB at 783 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.5/commons-io-2.5.pom
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.5/commons-io-2.5.pom (13 kB at 782 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/39/commons-parent-39.pom
Progress (1): 16/62 kB
Progress (1): 32/62 kB
Progress (1): 49/62 kB
Progress (1): 62 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/39/commons-parent-39.pom (62 kB at 3.6 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/16/apache-16.pom
Progress (1): 15 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/16/apache-16.pom (15 kB at 962 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.pom
Progress (1): 4.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.pom (4.7 kB at 395 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/19/maven-shared-components-19.pom
Progress (1): 6.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/19/maven-shared-components-19.pom (6.4 kB at 636 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/23/maven-parent-23.pom
Progress (1): 16/33 kB
Progress (1): 33 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/23/maven-parent-23.pom (33 kB at 2.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/13/apache-13.pom
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/13/apache-13.pom (14 kB at 1.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.1/maven-plugin-api-2.2.1.pom
Progress (1): 1.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.1/maven-plugin-api-2.2.1.pom (1.5 kB at 112 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.2.1/maven-2.2.1.pom
Progress (1): 16/22 kB
Progress (1): 22 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.2.1/maven-2.2.1.pom (22 kB at 1.9 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/11/maven-parent-11.pom
Progress (1): 16/32 kB
Progress (1): 32/32 kB
Progress (1): 32 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/11/maven-parent-11.pom (32 kB at 1.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/5/apache-5.pom
Progress (1): 4.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/5/apache-5.pom (4.1 kB at 186 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.1/maven-core-2.2.1.pom
Progress (1): 12 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.1/maven-core-2.2.1.pom (12 kB at 831 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.2.1/maven-settings-2.2.1.pom
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.2.1/maven-settings-2.2.1.pom (2.2 kB at 182 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.1/maven-model-2.2.1.pom
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.1/maven-model-2.2.1.pom (3.2 kB at 231 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.15/plexus-utils-1.5.15.pom
Progress (1): 6.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.15/plexus-utils-1.5.15.pom (6.8 kB at 527 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.2/plexus-2.0.2.pom
Progress (1): 12 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.2/plexus-2.0.2.pom (12 kB at 683 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.11/plexus-interpolation-1.11.pom
Progress (1): 889 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.11/plexus-interpolation-1.11.pom (889 B at 89 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.14/plexus-components-1.1.14.pom
Progress (1): 5.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.14/plexus-components-1.1.14.pom (5.8 kB at 649 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.1/maven-plugin-parameter-documenter-2.2.1.pom
Progress (1): 2.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.1/maven-plugin-parameter-documenter-2.2.1.pom (2.0 kB at 122 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-jdk14/1.5.6/slf4j-jdk14-1.5.6.pom
Progress (1): 1.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-jdk14/1.5.6/slf4j-jdk14-1.5.6.pom (1.9 kB at 127 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.5.6/slf4j-parent-1.5.6.pom
Progress (1): 7.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.5.6/slf4j-parent-1.5.6.pom (7.9 kB at 528 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.5.6/slf4j-api-1.5.6.pom
Progress (1): 3.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.5.6/slf4j-api-1.5.6.pom (3.0 kB at 119 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.5.6/jcl-over-slf4j-1.5.6.pom
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.5.6/jcl-over-slf4j-1.5.6.pom (2.2 kB at 114 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.1/maven-profile-2.2.1.pom
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.1/maven-profile-2.2.1.pom (2.2 kB at 167 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.1/maven-artifact-2.2.1.pom
Progress (1): 1.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.1/maven-artifact-2.2.1.pom (1.6 kB at 144 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.1/maven-repository-metadata-2.2.1.pom
Progress (1): 1.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.1/maven-repository-metadata-2.2.1.pom (1.9 kB at 144 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.1/maven-error-diagnostics-2.2.1.pom
Progress (1): 1.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.1/maven-error-diagnostics-2.2.1.pom (1.7 kB at 142 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.1/maven-project-2.2.1.pom
Progress (1): 2.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.1/maven-project-2.2.1.pom (2.8 kB at 213 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.1/maven-artifact-manager-2.2.1.pom
Progress (1): 3.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.1/maven-artifact-manager-2.2.1.pom (3.1 kB at 222 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/backport-util-concurrent/backport-util-concurrent/3.1/backport-util-concurrent-3.1.pom
Progress (1): 880 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/backport-util-concurrent/backport-util-concurrent/3.1/backport-util-concurrent-3.1.pom (880 B at 73 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.1/maven-plugin-registry-2.2.1.pom
Progress (1): 1.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.1/maven-plugin-registry-2.2.1.pom (1.9 kB at 129 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.1/maven-plugin-descriptor-2.2.1.pom
Progress (1): 2.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.1/maven-plugin-descriptor-2.2.1.pom (2.1 kB at 188 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.1/maven-monitor-2.2.1.pom
Progress (1): 1.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.1/maven-monitor-2.2.1.pom (1.3 kB at 84 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.1/maven-shared-utils-0.1.pom
Progress (1): 4.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.1/maven-shared-utils-0.1.pom (4.0 kB at 368 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/18/maven-shared-components-18.pom
Progress (1): 4.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/18/maven-shared-components-18.pom (4.9 kB at 352 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/22/maven-parent-22.pom
Progress (1): 16/30 kB
Progress (1): 30 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/22/maven-parent-22.pom (30 kB at 1.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/11/apache-11.pom
Progress (1): 15 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/11/apache-11.pom (15 kB at 644 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/2.0.1/jsr305-2.0.1.pom
Progress (1): 965 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/2.0.1/jsr305-2.0.1.pom (965 B at 80 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/0.9.10/plexus-java-0.9.10.pom
Progress (1): 5.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/0.9.10/plexus-java-0.9.10.pom (5.1 kB at 638 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-languages/0.9.10/plexus-languages-0.9.10.pom
Progress (1): 4.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-languages/0.9.10/plexus-languages-0.9.10.pom (4.1 kB at 518 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/6.2/asm-6.2.pom
Progress (1): 2.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/6.2/asm-6.2.pom (2.9 kB at 294 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M9/qdox-2.0-M9.pom
Progress (1): 16/16 kB
Progress (1): 16 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M9/qdox-2.0-M9.pom (16 kB at 990 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/9/oss-parent-9.pom
Progress (1): 6.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/9/oss-parent-9.pom (6.6 kB at 597 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.8.4/plexus-compiler-api-2.8.4.pom
Progress (1): 867 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.8.4/plexus-compiler-api-2.8.4.pom (867 B at 67 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler/2.8.4/plexus-compiler-2.8.4.pom
Progress (1): 6.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler/2.8.4/plexus-compiler-2.8.4.pom (6.0 kB at 603 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/4.0/plexus-components-4.0.pom
Progress (1): 2.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/4.0/plexus-components-4.0.pom (2.7 kB at 221 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.8.4/plexus-compiler-manager-2.8.4.pom
Progress (1): 692 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.8.4/plexus-compiler-manager-2.8.4.pom (692 B at 69 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.8.4/plexus-compiler-javac-2.8.4.pom
Progress (1): 771 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.8.4/plexus-compiler-javac-2.8.4.pom (771 B at 64 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compilers/2.8.4/plexus-compilers-2.8.4.pom
Progress (1): 1.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compilers/2.8.4/plexus-compilers-2.8.4.pom (1.3 kB at 103 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.jar
Progress (1): 16/49 kB
Progress (1): 32/49 kB
Progress (1): 49/49 kB
Progress (1): 49 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.jar (49 kB at 3.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7-noaop.jar
Progress (1): 16/153 kB
Progress (1): 33/153 kB
Progress (1): 49/153 kB
Progress (1): 66/153 kB
Progress (2): 66/153 kB | 16/52 kB
Progress (3): 66/153 kB | 16/52 kB | 16/202 kB
Progress (4): 66/153 kB | 16/52 kB | 16/202 kB | 16/472 kB
Progress (5): 66/153 kB | 16/52 kB | 16/202 kB | 16/472 kB | 16/165 kB
Progress (5): 66/153 kB | 16/52 kB | 33/202 kB | 16/472 kB | 16/165 kB
Progress (5): 66/153 kB | 16/52 kB | 33/202 kB | 16/472 kB | 33/165 kB
Progress (5): 82/153 kB | 16/52 kB | 33/202 kB | 16/472 kB | 33/165 kB
Progress (5): 82/153 kB | 16/52 kB | 49/202 kB | 16/472 kB | 33/165 kB
Progress (5): 98/153 kB | 16/52 kB | 49/202 kB | 16/472 kB | 33/165 kB
Progress (5): 98/153 kB | 32/52 kB | 49/202 kB | 16/472 kB | 33/165 kB
Progress (5): 115/153 kB | 32/52 kB | 49/202 kB | 16/472 kB | 33/165 kB
Progress (5): 115/153 kB | 32/52 kB | 49/202 kB | 32/472 kB | 33/165 kB
Progress (5): 115/153 kB | 32/52 kB | 49/202 kB | 32/472 kB | 49/165 kB
Progress (5): 115/153 kB | 32/52 kB | 49/202 kB | 32/472 kB | 66/165 kB
Progress (5): 131/153 kB | 32/52 kB | 49/202 kB | 32/472 kB | 66/165 kB
Progress (5): 131/153 kB | 32/52 kB | 49/202 kB | 32/472 kB | 82/165 kB
Progress (5): 131/153 kB | 32/52 kB | 63/202 kB | 32/472 kB | 82/165 kB
Progress (5): 131/153 kB | 32/52 kB | 63/202 kB | 49/472 kB | 82/165 kB
Progress (5): 131/153 kB | 49/52 kB | 63/202 kB | 49/472 kB | 82/165 kB
Progress (5): 131/153 kB | 49/52 kB | 63/202 kB | 49/472 kB | 98/165 kB
Progress (5): 131/153 kB | 52 kB | 63/202 kB | 49/472 kB | 98/165 kB   
                                                                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.jar (52 kB at 490 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.4/plexus-utils-2.0.4.jar
Progress (4): 131/153 kB | 63/202 kB | 65/472 kB | 98/165 kB
Progress (4): 147/153 kB | 63/202 kB | 65/472 kB | 98/165 kB
Progress (4): 153 kB | 63/202 kB | 65/472 kB | 98/165 kB    
                                                        
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.jar (153 kB at 1.3 MB/s)
Progress (3): 80/202 kB | 65/472 kB | 98/165 kB
                                               
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.jar
Progress (3): 96/202 kB | 65/472 kB | 98/165 kB
Progress (3): 113/202 kB | 65/472 kB | 98/165 kB
Progress (3): 129/202 kB | 65/472 kB | 98/165 kB
Progress (3): 145/202 kB | 65/472 kB | 98/165 kB
Progress (3): 162/202 kB | 65/472 kB | 98/165 kB
Progress (3): 162/202 kB | 65/472 kB | 115/165 kB
Progress (3): 162/202 kB | 81/472 kB | 115/165 kB
Progress (4): 162/202 kB | 81/472 kB | 115/165 kB | 16/222 kB
Progress (4): 162/202 kB | 81/472 kB | 115/165 kB | 33/222 kB
Progress (4): 162/202 kB | 81/472 kB | 115/165 kB | 49/222 kB
Progress (4): 178/202 kB | 81/472 kB | 115/165 kB | 49/222 kB
Progress (4): 194/202 kB | 81/472 kB | 115/165 kB | 49/222 kB
Progress (4): 202 kB | 81/472 kB | 115/165 kB | 49/222 kB    
Progress (4): 202 kB | 81/472 kB | 131/165 kB | 49/222 kB
                                                         
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.jar (202 kB at 1.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.0/maven-settings-3.0.jar
Progress (3): 81/472 kB | 131/165 kB | 63/222 kB
Progress (3): 81/472 kB | 147/165 kB | 63/222 kB
Progress (3): 81/472 kB | 164/165 kB | 63/222 kB
Progress (3): 81/472 kB | 165 kB | 63/222 kB    
Progress (3): 98/472 kB | 165 kB | 63/222 kB
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.jar (165 kB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.jar
Progress (2): 98/472 kB | 80/222 kB
Progress (3): 98/472 kB | 80/222 kB | 16/527 kB
Progress (3): 114/472 kB | 80/222 kB | 16/527 kB
Progress (3): 130/472 kB | 80/222 kB | 16/527 kB
Progress (3): 130/472 kB | 96/222 kB | 16/527 kB
Progress (3): 130/472 kB | 96/222 kB | 33/527 kB
Progress (3): 147/472 kB | 96/222 kB | 33/527 kB
Progress (3): 147/472 kB | 113/222 kB | 33/527 kB
Progress (3): 147/472 kB | 129/222 kB | 33/527 kB
Progress (3): 147/472 kB | 145/222 kB | 33/527 kB
Progress (3): 147/472 kB | 162/222 kB | 33/527 kB
Progress (3): 147/472 kB | 178/222 kB | 33/527 kB
Progress (3): 147/472 kB | 195/222 kB | 33/527 kB
Progress (3): 147/472 kB | 211/222 kB | 33/527 kB
Progress (3): 147/472 kB | 222 kB | 33/527 kB    
                                             
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.4/plexus-utils-2.0.4.jar (222 kB at 1.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.jar
Progress (2): 147/472 kB | 49/527 kB
Progress (3): 147/472 kB | 49/527 kB | 16/38 kB
Progress (3): 147/472 kB | 49/527 kB | 33/38 kB
Progress (3): 147/472 kB | 49/527 kB | 38 kB   
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.jar (38 kB at 210 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.jar
Progress (2): 147/472 kB | 63/527 kB
Progress (2): 147/472 kB | 79/527 kB
Progress (2): 147/472 kB | 96/527 kB
Progress (3): 147/472 kB | 96/527 kB | 16/47 kB
Progress (3): 163/472 kB | 96/527 kB | 16/47 kB
Progress (3): 163/472 kB | 112/527 kB | 16/47 kB
Progress (3): 163/472 kB | 112/527 kB | 33/47 kB
Progress (3): 163/472 kB | 112/527 kB | 47 kB   
                                             
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.0/maven-settings-3.0.jar (47 kB at 244 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.jar
Progress (2): 180/472 kB | 112/527 kB
Progress (2): 196/472 kB | 112/527 kB
Progress (2): 212/472 kB | 112/527 kB
Progress (2): 229/472 kB | 112/527 kB
Progress (2): 229/472 kB | 129/527 kB
Progress (3): 229/472 kB | 129/527 kB | 16/30 kB
Progress (3): 229/472 kB | 129/527 kB | 30 kB   
                                             
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.jar (30 kB at 143 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.jar
Progress (3): 229/472 kB | 129/527 kB | 16/148 kB
Progress (3): 229/472 kB | 145/527 kB | 16/148 kB
Progress (3): 229/472 kB | 161/527 kB | 16/148 kB
Progress (3): 229/472 kB | 178/527 kB | 16/148 kB
Progress (3): 229/472 kB | 178/527 kB | 32/148 kB
Progress (3): 229/472 kB | 178/527 kB | 49/148 kB
Progress (3): 229/472 kB | 178/527 kB | 65/148 kB
Progress (3): 229/472 kB | 178/527 kB | 81/148 kB
Progress (3): 245/472 kB | 178/527 kB | 81/148 kB
Progress (3): 262/472 kB | 178/527 kB | 81/148 kB
Progress (3): 262/472 kB | 194/527 kB | 81/148 kB
Progress (3): 262/472 kB | 194/527 kB | 98/148 kB
Progress (3): 262/472 kB | 194/527 kB | 114/148 kB
Progress (3): 262/472 kB | 194/527 kB | 130/148 kB
Progress (3): 278/472 kB | 194/527 kB | 130/148 kB
Progress (4): 278/472 kB | 194/527 kB | 130/148 kB | 16/106 kB
Progress (4): 278/472 kB | 194/527 kB | 130/148 kB | 33/106 kB
Progress (4): 278/472 kB | 211/527 kB | 130/148 kB | 33/106 kB
Progress (4): 278/472 kB | 211/527 kB | 130/148 kB | 49/106 kB
Progress (4): 278/472 kB | 211/527 kB | 147/148 kB | 49/106 kB
Progress (4): 278/472 kB | 211/527 kB | 148 kB | 49/106 kB    
                                                          
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.jar (148 kB at 599 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.jar
Progress (3): 278/472 kB | 211/527 kB | 66/106 kB
Progress (4): 278/472 kB | 211/527 kB | 66/106 kB | 16/51 kB
Progress (4): 278/472 kB | 211/527 kB | 82/106 kB | 16/51 kB
Progress (4): 278/472 kB | 211/527 kB | 97/106 kB | 16/51 kB
Progress (4): 278/472 kB | 211/527 kB | 97/106 kB | 33/51 kB
Progress (4): 294/472 kB | 211/527 kB | 97/106 kB | 33/51 kB
Progress (4): 294/472 kB | 211/527 kB | 97/106 kB | 49/51 kB
Progress (4): 311/472 kB | 211/527 kB | 97/106 kB | 49/51 kB
Progress (4): 327/472 kB | 211/527 kB | 97/106 kB | 49/51 kB
Progress (5): 327/472 kB | 211/527 kB | 97/106 kB | 49/51 kB | 14 kB
                                                                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.jar (14 kB at 52 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.jar
Progress (4): 327/472 kB | 211/527 kB | 106 kB | 49/51 kB
                                                         
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.jar (106 kB at 403 kB/s)
Progress (3): 327/472 kB | 227/527 kB | 49/51 kB
                                                
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.jar
Progress (3): 327/472 kB | 243/527 kB | 49/51 kB
Progress (3): 327/472 kB | 243/527 kB | 51 kB   
Progress (3): 343/472 kB | 243/527 kB | 51 kB
                                             
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.jar (51 kB at 192 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.jar
Progress (2): 360/472 kB | 243/527 kB
Progress (2): 376/472 kB | 243/527 kB
Progress (2): 393/472 kB | 243/527 kB
Progress (2): 402/472 kB | 243/527 kB
Progress (2): 402/472 kB | 260/527 kB
Progress (2): 418/472 kB | 260/527 kB
Progress (2): 418/472 kB | 276/527 kB
Progress (2): 418/472 kB | 292/527 kB
Progress (2): 418/472 kB | 309/527 kB
Progress (2): 435/472 kB | 309/527 kB
Progress (2): 451/472 kB | 309/527 kB
Progress (2): 468/472 kB | 309/527 kB
Progress (2): 472 kB | 309/527 kB    
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7-noaop.jar (472 kB at 1.6 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.jar
Progress (1): 325/527 kB
Progress (1): 342/527 kB
Progress (1): 358/527 kB
Progress (2): 358/527 kB | 16/108 kB
Progress (2): 358/527 kB | 32/108 kB
Progress (2): 358/527 kB | 49/108 kB
Progress (2): 358/527 kB | 65/108 kB
Progress (2): 358/527 kB | 81/108 kB
Progress (3): 358/527 kB | 81/108 kB | 16/74 kB
Progress (4): 358/527 kB | 81/108 kB | 16/74 kB | 16/61 kB
Progress (5): 358/527 kB | 81/108 kB | 16/74 kB | 16/61 kB | 16/46 kB
Progress (5): 358/527 kB | 81/108 kB | 16/74 kB | 16/61 kB | 33/46 kB
Progress (5): 358/527 kB | 81/108 kB | 16/74 kB | 16/61 kB | 46 kB   
                                                                  
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.jar (46 kB at 147 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.7.1/plexus-component-annotations-1.7.1.jar
Progress (4): 358/527 kB | 98/108 kB | 16/74 kB | 16/61 kB
Progress (4): 358/527 kB | 108 kB | 16/74 kB | 16/61 kB   
Progress (4): 358/527 kB | 108 kB | 16/74 kB | 33/61 kB
                                                       
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.jar (108 kB at 344 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.jar
Progress (3): 358/527 kB | 33/74 kB | 33/61 kB
Progress (3): 374/527 kB | 33/74 kB | 33/61 kB
Progress (3): 391/527 kB | 33/74 kB | 33/61 kB
Progress (3): 391/527 kB | 33/74 kB | 49/61 kB
Progress (3): 391/527 kB | 49/74 kB | 49/61 kB
Progress (3): 391/527 kB | 66/74 kB | 49/61 kB
Progress (3): 391/527 kB | 74 kB | 49/61 kB   
                                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.jar (74 kB at 227 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.jar
Progress (3): 391/527 kB | 49/61 kB | 4.3 kB
Progress (3): 391/527 kB | 61 kB | 4.3 kB   
                                         
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.7.1/plexus-component-annotations-1.7.1.jar (4.3 kB at 13 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.2.1/maven-shared-utils-3.2.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.jar (61 kB at 186 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.5/commons-io-2.5.jar
Progress (1): 407/527 kB
Progress (2): 407/527 kB | 16/29 kB
Progress (2): 424/527 kB | 16/29 kB
Progress (2): 440/527 kB | 16/29 kB
Progress (2): 440/527 kB | 29 kB   
                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.jar (29 kB at 85 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.jar
Progress (1): 456/527 kB
Progress (1): 473/527 kB
Progress (1): 489/527 kB
Progress (1): 505/527 kB
Progress (2): 505/527 kB | 13 kB
                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.jar (13 kB at 39 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/0.9.10/plexus-java-0.9.10.jar
Progress (1): 522/527 kB
Progress (1): 527 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.jar (527 kB at 1.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/6.2/asm-6.2.jar
Progress (1): 14 kB
Progress (2): 14 kB | 16/209 kB
                               
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.jar (14 kB at 38 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M9/qdox-2.0-M9.jar
Progress (1): 33/209 kB
Progress (2): 33/209 kB | 16/167 kB
Progress (2): 33/209 kB | 33/167 kB
Progress (2): 33/209 kB | 49/167 kB
Progress (2): 33/209 kB | 62/167 kB
Progress (2): 49/209 kB | 62/167 kB
Progress (2): 49/209 kB | 79/167 kB
Progress (3): 49/209 kB | 79/167 kB | 16/39 kB
Progress (4): 49/209 kB | 79/167 kB | 16/39 kB | 16/111 kB
Progress (4): 49/209 kB | 79/167 kB | 16/39 kB | 33/111 kB
Progress (4): 49/209 kB | 79/167 kB | 16/39 kB | 49/111 kB
Progress (4): 49/209 kB | 79/167 kB | 16/39 kB | 66/111 kB
Progress (4): 49/209 kB | 79/167 kB | 16/39 kB | 81/111 kB
Progress (4): 49/209 kB | 79/167 kB | 16/39 kB | 97/111 kB
Progress (4): 49/209 kB | 79/167 kB | 16/39 kB | 111 kB   
                                                       
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/6.2/asm-6.2.jar (111 kB at 288 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.8.4/plexus-compiler-api-2.8.4.jar
Progress (4): 49/209 kB | 79/167 kB | 16/39 kB | 16/317 kB
Progress (4): 63/209 kB | 79/167 kB | 16/39 kB | 16/317 kB
Progress (4): 63/209 kB | 95/167 kB | 16/39 kB | 16/317 kB
Progress (4): 79/209 kB | 95/167 kB | 16/39 kB | 16/317 kB
Progress (4): 79/209 kB | 95/167 kB | 16/39 kB | 33/317 kB
Progress (4): 95/209 kB | 95/167 kB | 16/39 kB | 33/317 kB
Progress (4): 95/209 kB | 95/167 kB | 16/39 kB | 49/317 kB
Progress (4): 95/209 kB | 95/167 kB | 33/39 kB | 49/317 kB
Progress (4): 95/209 kB | 95/167 kB | 39 kB | 49/317 kB   
                                                       
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/0.9.10/plexus-java-0.9.10.jar (39 kB at 98 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.8.4/plexus-compiler-manager-2.8.4.jar
Progress (4): 95/209 kB | 95/167 kB | 49/317 kB | 16/27 kB
Progress (4): 95/209 kB | 95/167 kB | 49/317 kB | 27 kB   
Progress (4): 112/209 kB | 95/167 kB | 49/317 kB | 27 kB
                                                        
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.8.4/plexus-compiler-api-2.8.4.jar (27 kB at 66 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.8.4/plexus-compiler-javac-2.8.4.jar
Progress (3): 128/209 kB | 95/167 kB | 49/317 kB
Progress (3): 145/209 kB | 95/167 kB | 49/317 kB
Progress (3): 145/209 kB | 95/167 kB | 64/317 kB
Progress (3): 161/209 kB | 95/167 kB | 64/317 kB
Progress (3): 161/209 kB | 111/167 kB | 64/317 kB
Progress (3): 161/209 kB | 128/167 kB | 64/317 kB
Progress (3): 177/209 kB | 128/167 kB | 64/317 kB
Progress (3): 177/209 kB | 128/167 kB | 81/317 kB
Progress (3): 194/209 kB | 128/167 kB | 81/317 kB
Progress (3): 194/209 kB | 144/167 kB | 81/317 kB
Progress (3): 194/209 kB | 144/167 kB | 97/317 kB
Progress (4): 194/209 kB | 144/167 kB | 97/317 kB | 4.7 kB
                                                          
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.8.4/plexus-compiler-manager-2.8.4.jar (4.7 kB at 11 kB/s)
Progress (3): 194/209 kB | 144/167 kB | 114/317 kB
Progress (3): 209 kB | 144/167 kB | 114/317 kB    
Progress (3): 209 kB | 161/167 kB | 114/317 kB
                                              
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.5/commons-io-2.5.jar (209 kB at 480 kB/s)
Progress (2): 167 kB | 114/317 kB
Progress (3): 167 kB | 114/317 kB | 16/21 kB
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.2.1/maven-shared-utils-3.2.1.jar (167 kB at 380 kB/s)
Progress (2): 130/317 kB | 16/21 kB
Progress (2): 146/317 kB | 16/21 kB
Progress (2): 163/317 kB | 16/21 kB
Progress (2): 163/317 kB | 21 kB   
                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.8.4/plexus-compiler-javac-2.8.4.jar (21 kB at 48 kB/s)
Progress (1): 179/317 kB
Progress (1): 195/317 kB
Progress (1): 212/317 kB
Progress (1): 228/317 kB
Progress (1): 245/317 kB
Progress (1): 261/317 kB
Progress (1): 277/317 kB
Progress (1): 294/317 kB
Progress (1): 310/317 kB
Progress (1): 317 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M9/qdox-2.0-M9.jar (317 kB at 687 kB/s)
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ math-utils ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /var/jenkins_home/workspace/java-cicd-clean@2/src/test/resources
[INFO] 
[INFO] --- compiler:3.8.1:testCompile (default-testCompile) @ math-utils ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- surefire:2.22.2:test (default-test) @ math-utils ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/2.22.2/maven-surefire-common-2.22.2.pom
Progress (1): 11 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/2.22.2/maven-surefire-common-2.22.2.pom (11 kB at 764 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.5.2/maven-plugin-annotations-3.5.2.pom
Progress (1): 1.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.5.2/maven-plugin-annotations-3.5.2.pom (1.6 kB at 125 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-tools/3.5.2/maven-plugin-tools-3.5.2.pom
Progress (1): 15 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-tools/3.5.2/maven-plugin-tools-3.5.2.pom (15 kB at 1.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/31/maven-parent-31.pom
Progress (1): 16/43 kB
Progress (1): 33/43 kB
Progress (1): 43 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/31/maven-parent-31.pom (43 kB at 3.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/19/apache-19.pom
Progress (1): 15 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/19/apache-19.pom (15 kB at 484 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/2.22.2/surefire-api-2.22.2.pom
Progress (1): 3.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/2.22.2/surefire-api-2.22.2.pom (3.5 kB at 322 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/2.22.2/surefire-logger-api-2.22.2.pom
Progress (1): 2.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/2.22.2/surefire-logger-api-2.22.2.pom (2.0 kB at 131 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/2.22.2/surefire-booter-2.22.2.pom
Progress (1): 7.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/2.22.2/surefire-booter-2.22.2.pom (7.5 kB at 324 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9-stable-1/plexus-container-default-1.0-alpha-9-stable-1.pom
Progress (1): 3.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9-stable-1/plexus-container-default-1.0-alpha-9-stable-1.pom (3.9 kB at 197 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.pom
Progress (1): 16/24 kB
Progress (1): 24 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.pom (24 kB at 1.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1/classworlds-1.1.pom
Progress (1): 3.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1/classworlds-1.1.pom (3.3 kB at 166 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-toolchain/2.2.1/maven-toolchain-2.2.1.pom
Progress (1): 3.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-toolchain/2.2.1/maven-toolchain-2.2.1.pom (3.3 kB at 257 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M8/qdox-2.0-M8.pom
Progress (1): 16 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M8/qdox-2.0-M8.pom (16 kB at 990 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/2.22.2/maven-surefire-common-2.22.2.jar
Progress (1): 16/528 kB
Progress (1): 33/528 kB
Progress (1): 49/528 kB
Progress (1): 66/528 kB
Progress (1): 82/528 kB
Progress (1): 98/528 kB
Progress (1): 115/528 kB
Progress (1): 131/528 kB
Progress (1): 147/528 kB
Progress (1): 164/528 kB
Progress (1): 180/528 kB
Progress (1): 197/528 kB
Progress (1): 213/528 kB
Progress (1): 229/528 kB
Progress (1): 246/528 kB
Progress (1): 262/528 kB
Progress (1): 279/528 kB
Progress (1): 295/528 kB
Progress (1): 311/528 kB
Progress (1): 328/528 kB
Progress (1): 344/528 kB
Progress (1): 360/528 kB
Progress (1): 377/528 kB
Progress (1): 393/528 kB
Progress (1): 410/528 kB
Progress (1): 426/528 kB
Progress (1): 442/528 kB
Progress (1): 459/528 kB
Progress (1): 475/528 kB
Progress (1): 492/528 kB
Progress (1): 508/528 kB
Progress (1): 524/528 kB
Progress (1): 528 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/2.22.2/maven-surefire-common-2.22.2.jar (528 kB at 9.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.1/maven-plugin-api-2.2.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.5.2/maven-plugin-annotations-3.5.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/2.22.2/surefire-api-2.22.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/2.22.2/surefire-logger-api-2.22.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/2.22.2/surefire-booter-2.22.2.jar
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.5.2/maven-plugin-annotations-3.5.2.jar (14 kB at 1.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.1/maven-artifact-2.2.1.jar
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/2.22.2/surefire-logger-api-2.22.2.jar (13 kB at 1.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.15/plexus-utils-1.5.15.jar
Progress (1): 16/186 kB
Progress (2): 16/186 kB | 12 kB
Progress (2): 33/186 kB | 12 kB
Progress (2): 49/186 kB | 12 kB
Progress (2): 66/186 kB | 12 kB
Progress (2): 82/186 kB | 12 kB
Progress (2): 98/186 kB | 12 kB
Progress (2): 115/186 kB | 12 kB
Progress (3): 115/186 kB | 12 kB | 16/80 kB
                                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.1/maven-plugin-api-2.2.1.jar (12 kB at 442 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.1/maven-plugin-descriptor-2.2.1.jar
Progress (2): 115/186 kB | 32/80 kB
Progress (2): 115/186 kB | 49/80 kB
Progress (2): 131/186 kB | 49/80 kB
Progress (2): 147/186 kB | 49/80 kB
Progress (2): 164/186 kB | 49/80 kB
Progress (3): 164/186 kB | 49/80 kB | 16/274 kB
Progress (3): 180/186 kB | 49/80 kB | 16/274 kB
Progress (3): 186 kB | 49/80 kB | 16/274 kB    
Progress (3): 186 kB | 49/80 kB | 33/274 kB
Progress (3): 186 kB | 65/80 kB | 33/274 kB
                                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/2.22.2/surefire-api-2.22.2.jar (186 kB at 6.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9-stable-1/plexus-container-default-1.0-alpha-9-stable-1.jar
Progress (2): 80 kB | 33/274 kB
                               
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.1/maven-artifact-2.2.1.jar (80 kB at 2.8 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.jar
Progress (1): 49/274 kB
Progress (1): 66/274 kB
Progress (1): 82/274 kB
Progress (1): 98/274 kB
Progress (1): 115/274 kB
Progress (1): 131/274 kB
Progress (1): 147/274 kB
Progress (1): 164/274 kB
Progress (1): 180/274 kB
Progress (1): 197/274 kB
Progress (1): 213/274 kB
Progress (2): 213/274 kB | 16/228 kB
Progress (2): 213/274 kB | 33/228 kB
Progress (2): 213/274 kB | 49/228 kB
Progress (2): 229/274 kB | 49/228 kB
Progress (2): 229/274 kB | 66/228 kB
Progress (2): 229/274 kB | 79/228 kB
Progress (2): 229/274 kB | 95/228 kB
Progress (2): 229/274 kB | 111/228 kB
Progress (2): 229/274 kB | 128/228 kB
Progress (2): 229/274 kB | 144/228 kB
Progress (2): 246/274 kB | 144/228 kB
Progress (2): 246/274 kB | 161/228 kB
Progress (3): 246/274 kB | 161/228 kB | 16/39 kB
Progress (4): 246/274 kB | 161/228 kB | 16/39 kB | 16/194 kB
Progress (4): 246/274 kB | 177/228 kB | 16/39 kB | 16/194 kB
Progress (4): 262/274 kB | 177/228 kB | 16/39 kB | 16/194 kB
Progress (4): 262/274 kB | 177/228 kB | 16/39 kB | 33/194 kB
Progress (4): 262/274 kB | 193/228 kB | 16/39 kB | 33/194 kB
Progress (4): 274 kB | 193/228 kB | 16/39 kB | 33/194 kB    
Progress (4): 274 kB | 210/228 kB | 16/39 kB | 33/194 kB
Progress (4): 274 kB | 210/228 kB | 32/39 kB | 33/194 kB
Progress (4): 274 kB | 210/228 kB | 39 kB | 33/194 kB   
                                                     
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/2.22.2/surefire-booter-2.22.2.jar (274 kB at 5.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.1/maven-project-2.2.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.1/maven-plugin-descriptor-2.2.1.jar (39 kB at 741 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.2.1/maven-settings-2.2.1.jar
Progress (2): 226/228 kB | 33/194 kB
Progress (2): 228 kB | 33/194 kB    
Progress (3): 228 kB | 33/194 kB | 16/315 kB
Progress (3): 228 kB | 49/194 kB | 16/315 kB
Progress (3): 228 kB | 49/194 kB | 33/315 kB
Progress (3): 228 kB | 63/194 kB | 33/315 kB
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.15/plexus-utils-1.5.15.jar (228 kB at 4.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.1/maven-profile-2.2.1.jar
Progress (2): 63/194 kB | 49/315 kB
Progress (2): 79/194 kB | 49/315 kB
Progress (2): 79/194 kB | 62/315 kB
Progress (2): 96/194 kB | 62/315 kB
Progress (2): 96/194 kB | 78/315 kB
Progress (2): 96/194 kB | 94/315 kB
Progress (2): 112/194 kB | 94/315 kB
Progress (2): 129/194 kB | 94/315 kB
Progress (2): 145/194 kB | 94/315 kB
Progress (2): 145/194 kB | 111/315 kB
Progress (2): 161/194 kB | 111/315 kB
Progress (2): 178/194 kB | 111/315 kB
Progress (2): 178/194 kB | 127/315 kB
Progress (2): 178/194 kB | 144/315 kB
Progress (3): 178/194 kB | 144/315 kB | 16/156 kB
Progress (3): 178/194 kB | 144/315 kB | 33/156 kB
Progress (3): 178/194 kB | 144/315 kB | 49/156 kB
Progress (3): 178/194 kB | 144/315 kB | 66/156 kB
Progress (3): 178/194 kB | 144/315 kB | 82/156 kB
Progress (3): 178/194 kB | 144/315 kB | 98/156 kB
Progress (3): 178/194 kB | 144/315 kB | 115/156 kB
Progress (3): 178/194 kB | 144/315 kB | 131/156 kB
Progress (3): 178/194 kB | 144/315 kB | 147/156 kB
Progress (3): 178/194 kB | 144/315 kB | 156 kB    
Progress (3): 178/194 kB | 160/315 kB | 156 kB
                                              
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.1/maven-project-2.2.1.jar (156 kB at 1.9 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.1/maven-artifact-manager-2.2.1.jar
Progress (3): 178/194 kB | 160/315 kB | 16/35 kB
Progress (3): 178/194 kB | 160/315 kB | 32/35 kB
Progress (3): 194/194 kB | 160/315 kB | 32/35 kB
Progress (3): 194 kB | 160/315 kB | 32/35 kB    
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9-stable-1/plexus-container-default-1.0-alpha-9-stable-1.jar (194 kB at 2.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/backport-util-concurrent/backport-util-concurrent/3.1/backport-util-concurrent-3.1.jar
Progress (2): 160/315 kB | 35 kB
                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.1/maven-profile-2.2.1.jar (35 kB at 384 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.1/maven-plugin-registry-2.2.1.jar
Progress (1): 176/315 kB
Progress (1): 193/315 kB
Progress (1): 209/315 kB
Progress (1): 226/315 kB
Progress (1): 242/315 kB
Progress (2): 242/315 kB | 16/68 kB
Progress (2): 242/315 kB | 33/68 kB
Progress (2): 242/315 kB | 49/68 kB
Progress (2): 242/315 kB | 66/68 kB
Progress (2): 242/315 kB | 68 kB   
                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.1/maven-artifact-manager-2.2.1.jar (68 kB at 573 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.11/plexus-interpolation-1.11.jar
Progress (1): 258/315 kB
Progress (1): 275/315 kB
Progress (1): 291/315 kB
Progress (2): 291/315 kB | 16/30 kB
Progress (3): 291/315 kB | 16/30 kB | 16/332 kB
Progress (3): 307/315 kB | 16/30 kB | 16/332 kB
Progress (3): 307/315 kB | 30 kB | 16/332 kB   
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.1/maven-plugin-registry-2.2.1.jar (30 kB at 230 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.1/maven-model-2.2.1.jar
Progress (2): 307/315 kB | 33/332 kB
Progress (2): 315 kB | 33/332 kB    
Progress (2): 315 kB | 49/332 kB
                                
Downloaded from central: https://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.jar (315 kB at 2.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.1/maven-core-2.2.1.jar
Progress (1): 66/332 kB
Progress (1): 82/332 kB
Progress (1): 98/332 kB
Progress (2): 98/332 kB | 16/51 kB
Progress (2): 115/332 kB | 16/51 kB
Progress (2): 131/332 kB | 16/51 kB
Progress (2): 147/332 kB | 16/51 kB
Progress (2): 164/332 kB | 16/51 kB
Progress (2): 180/332 kB | 16/51 kB
Progress (3): 180/332 kB | 16/51 kB | 16/178 kB
Progress (3): 180/332 kB | 16/51 kB | 33/178 kB
Progress (3): 180/332 kB | 16/51 kB | 49/178 kB
Progress (3): 180/332 kB | 16/51 kB | 65/178 kB
Progress (3): 180/332 kB | 33/51 kB | 65/178 kB
Progress (3): 180/332 kB | 33/51 kB | 81/178 kB
Progress (3): 180/332 kB | 49/51 kB | 81/178 kB
Progress (3): 180/332 kB | 51 kB | 81/178 kB   
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.11/plexus-interpolation-1.11.jar (51 kB at 318 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.1/maven-plugin-parameter-documenter-2.2.1.jar
Progress (2): 180/332 kB | 98/178 kB
Progress (2): 197/332 kB | 98/178 kB
Progress (2): 213/332 kB | 98/178 kB
Progress (3): 213/332 kB | 98/178 kB | 16/88 kB
Progress (3): 213/332 kB | 98/178 kB | 32/88 kB
Progress (3): 213/332 kB | 114/178 kB | 32/88 kB
Progress (3): 213/332 kB | 130/178 kB | 32/88 kB
Progress (3): 213/332 kB | 147/178 kB | 32/88 kB
Progress (3): 213/332 kB | 163/178 kB | 32/88 kB
Progress (4): 213/332 kB | 163/178 kB | 32/88 kB | 16/22 kB
Progress (4): 213/332 kB | 163/178 kB | 32/88 kB | 22 kB   
Progress (4): 229/332 kB | 163/178 kB | 32/88 kB | 22 kB
                                                        
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.1/maven-plugin-parameter-documenter-2.2.1.jar (22 kB at 125 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-jdk14/1.5.6/slf4j-jdk14-1.5.6.jar
Progress (3): 246/332 kB | 163/178 kB | 32/88 kB
Progress (3): 262/332 kB | 163/178 kB | 32/88 kB
Progress (3): 262/332 kB | 163/178 kB | 49/88 kB
Progress (3): 262/332 kB | 163/178 kB | 65/88 kB
Progress (3): 262/332 kB | 163/178 kB | 81/88 kB
Progress (3): 262/332 kB | 163/178 kB | 88 kB   
                                             
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.1/maven-model-2.2.1.jar (88 kB at 461 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.5.6/slf4j-api-1.5.6.jar
Progress (2): 262/332 kB | 178 kB
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.1/maven-core-2.2.1.jar (178 kB at 931 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.5.6/jcl-over-slf4j-1.5.6.jar
Progress (1): 279/332 kB
Progress (2): 279/332 kB | 8.8 kB
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-jdk14/1.5.6/slf4j-jdk14-1.5.6.jar (8.8 kB at 45 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.1/maven-repository-metadata-2.2.1.jar
Progress (1): 295/332 kB
Progress (1): 311/332 kB
Progress (1): 328/332 kB
Progress (1): 332 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/backport-util-concurrent/backport-util-concurrent/3.1/backport-util-concurrent-3.1.jar (332 kB at 1.6 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.1/maven-error-diagnostics-2.2.1.jar
Progress (1): 16/22 kB
Progress (1): 22 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.5.6/slf4j-api-1.5.6.jar (22 kB at 110 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.1/maven-monitor-2.2.1.jar
Progress (1): 16/17 kB
Progress (1): 17 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.5.6/jcl-over-slf4j-1.5.6.jar (17 kB at 81 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1/classworlds-1.1.jar
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.1/maven-error-diagnostics-2.2.1.jar (13 kB at 60 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-toolchain/2.2.1/maven-toolchain-2.2.1.jar
Progress (1): 16/38 kB
Progress (1): 33/38 kB
Progress (1): 38 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1/classworlds-1.1.jar (38 kB at 171 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M8/qdox-2.0-M8.jar
Progress (1): 10 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.1/maven-monitor-2.2.1.jar (10 kB at 47 kB/s)
Progress (1): 16/26 kB
Progress (1): 26 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.1/maven-repository-metadata-2.2.1.jar (26 kB at 114 kB/s)
Progress (1): 16/38 kB
Progress (1): 33/38 kB
Progress (1): 38 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-toolchain/2.2.1/maven-toolchain-2.2.1.jar (38 kB at 155 kB/s)
Progress (1): 16/316 kB
Progress (1): 32/316 kB
Progress (1): 49/316 kB
Progress (1): 65/316 kB
Progress (1): 81/316 kB
Progress (1): 98/316 kB
Progress (1): 114/316 kB
Progress (1): 130/316 kB
Progress (1): 147/316 kB
Progress (1): 163/316 kB
Progress (1): 180/316 kB
Progress (1): 196/316 kB
Progress (1): 212/316 kB
Progress (1): 229/316 kB
Progress (1): 245/316 kB
Progress (1): 262/316 kB
Progress (1): 278/316 kB
Progress (1): 294/316 kB
Progress (1): 311/316 kB
Progress (1): 316 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M8/qdox-2.0-M8.jar (316 kB at 1.1 MB/s)
Progress (1): 16/49 kB
Progress (1): 33/49 kB
Progress (1): 49 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.2.1/maven-settings-2.2.1.jar (49 kB at 152 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/2.22.2/surefire-junit-platform-2.22.2.pom
Progress (1): 7.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/2.22.2/surefire-junit-platform-2.22.2.pom (7.0 kB at 152 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-providers/2.22.2/surefire-providers-2.22.2.pom
Progress (1): 2.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-providers/2.22.2/surefire-providers-2.22.2.pom (2.5 kB at 226 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.3.1/junit-platform-launcher-1.3.1.pom
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.3.1/junit-platform-launcher-1.3.1.pom (2.2 kB at 148 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.0.0/apiguardian-api-1.0.0.pom
Progress (1): 1.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.0.0/apiguardian-api-1.0.0.pom (1.2 kB at 65 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.3.1/junit-platform-engine-1.3.1.pom
Progress (1): 2.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.3.1/junit-platform-engine-1.3.1.pom (2.4 kB at 104 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.3.1/junit-platform-commons-1.3.1.pom
Progress (1): 2.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.3.1/junit-platform-commons-1.3.1.pom (2.0 kB at 202 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.1.1/opentest4j-1.1.1.pom
Progress (1): 1.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.1.1/opentest4j-1.1.1.pom (1.7 kB at 105 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/2.22.2/surefire-junit-platform-2.22.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.3.1/junit-platform-launcher-1.3.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.0.0/apiguardian-api-1.0.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.3.1/junit-platform-commons-1.3.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.3.1/junit-platform-engine-1.3.1.jar
Progress (1): 16/66 kB
Progress (1): 33/66 kB
Progress (2): 33/66 kB | 2.2 kB
                               
Downloaded from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.0.0/apiguardian-api-1.0.0.jar (2.2 kB at 108 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.1.1/opentest4j-1.1.1.jar
Progress (2): 33/66 kB | 16/95 kB
Progress (3): 33/66 kB | 16/95 kB | 16/135 kB
Progress (3): 33/66 kB | 32/95 kB | 16/135 kB
Progress (3): 49/66 kB | 32/95 kB | 16/135 kB
Progress (3): 66/66 kB | 32/95 kB | 16/135 kB
Progress (3): 66 kB | 32/95 kB | 16/135 kB   
Progress (4): 66 kB | 32/95 kB | 16/135 kB | 16/78 kB
                                                     
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/2.22.2/surefire-junit-platform-2.22.2.jar (66 kB at 2.1 MB/s)
Progress (3): 32/95 kB | 32/135 kB | 16/78 kB
Progress (3): 32/95 kB | 49/135 kB | 16/78 kB
Progress (3): 32/95 kB | 49/135 kB | 33/78 kB
Progress (3): 32/95 kB | 49/135 kB | 49/78 kB
Progress (3): 49/95 kB | 49/135 kB | 49/78 kB
Progress (3): 65/95 kB | 49/135 kB | 49/78 kB
Progress (3): 81/95 kB | 49/135 kB | 49/78 kB
Progress (3): 95 kB | 49/135 kB | 49/78 kB   
                                          
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.3.1/junit-platform-launcher-1.3.1.jar (95 kB at 1.9 MB/s)
Progress (2): 49/135 kB | 66/78 kB
Progress (2): 49/135 kB | 78 kB   
                               
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.3.1/junit-platform-commons-1.3.1.jar (78 kB at 1.5 MB/s)
Progress (1): 65/135 kB
Progress (2): 65/135 kB | 7.1 kB
                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.1.1/opentest4j-1.1.1.jar (7.1 kB at 203 kB/s)
Progress (1): 81/135 kB
Progress (1): 98/135 kB
Progress (1): 114/135 kB
Progress (1): 130/135 kB
Progress (1): 135 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.3.1/junit-platform-engine-1.3.1.jar (135 kB at 2.1 MB/s)
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.mathutils.MathUtilsTest
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.123 s - in com.mathutils.MathUtilsTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- jacoco:0.8.8:report (report) @ math-utils ---
[INFO] Loading execution data file /var/jenkins_home/workspace/java-cicd-clean@2/target/jacoco.exec
[INFO] Analyzed bundle 'math-utils' with 2 classes
[INFO] 
[INFO] --- jacoco:0.8.8:report (post-unit-test) @ math-utils ---
[INFO] Loading execution data file /var/jenkins_home/workspace/java-cicd-clean@2/target/jacoco.exec
[INFO] Analyzed bundle 'math-utils' with 2 classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  9.093 s
[INFO] Finished at: 2025-03-28T19:15:48Z
[INFO] ------------------------------------------------------------------------
[Pipeline] }
$ docker stop --time=1 bdf432400e3e434a7ad44b991a11a4618aa21a314faa90b2cd51253419a89ee8
$ docker rm -f --volumes bdf432400e3e434a7ad44b991a11a4618aa21a314faa90b2cd51253419a89ee8
[Pipeline] // withDockerContainer
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // node
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Static Code Analysis)
[Pipeline] withSonarQubeEnv
Injecting SonarQube environment variables using the configuration: My SonarQube Server
[Pipeline] {
[Pipeline] sh
+ mvn sonar:sonar -Dsonar.projectKey=java-cicd-pipeline -Dsonar.host.url=http://host.docker.internal:9000 -Dsonar.login=******
/var/jenkins_home/workspace/java-cicd-clean@tmp/durable-3905f303/script.sh.copy: 2: mvn: not found
[Pipeline] }
WARN: Unable to locate 'report-task.txt' in the workspace. Did the SonarScanner succeed?
[Pipeline] // withSonarQubeEnv
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Docker Build & Push)
Stage "Docker Build & Push" skipped due to earlier failure(s)
[Pipeline] getContext
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Deploy to Kubernetes)
Stage "Deploy to Kubernetes" skipped due to earlier failure(s)
[Pipeline] getContext
[Pipeline] }
[Pipeline] // stage
[Pipeline] }
[Pipeline] // withCredentials
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // node
[Pipeline] End of Pipeline
ERROR: script returned exit code 127
Finished: FAILURE
