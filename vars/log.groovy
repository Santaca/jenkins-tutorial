def hello   (String message) {
    echo "${message}"
    host = sh "hostname -I"
    echo "${host}"
}