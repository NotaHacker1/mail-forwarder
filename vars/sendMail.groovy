#!groovy
//@NonCPS
def call(name, address) {
    println "in";
    mail bcc: '', body: "Dear ${name} testy testy testington",
    cc: '', from: 'swclpec@gmail.com', replyTo: 'swclpec@gmail.com',
    subject: "test email from Jenkins",
    to: "${address}";
}