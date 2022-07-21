1- Login to Jenkins.
2- Create mew job and select pipeline from the options of job type.
3- Copy the script from `Jenkinsfile` of the project root.
4- Paste it to the pipeline script section of the job configuration of Jenkins.
5- Go to `Manage Jenkins`, click `Manage Credentials`.
6- Add a new credential to there named `githubSSHMichaelUfuoma` or if you select some othe name then replcae `Jenkinsfile` for the key referance on the clone step.
7- Paste the private key located in `github.key` file in the root of the project.
8- Run the build to see the result.