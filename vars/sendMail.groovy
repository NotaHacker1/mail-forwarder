#!groovy
//@NonCPS
def call(name, address) {
    println "in for ${name}";
    //[$class: 'Mailer', bcc: '', body: "Dear ${name} testy testy testington",
    //cc: '', from: 'swclpec@gmail.com', replyTo: 'swclpec@gmail.com',
    //subject: "test email from Jenkins",
    //recipients: "${address}"];
    mail( body: "Dear ${name} testy testy testington", mimeType: 'text/html',
        replyTo: 'swclpec@gmail.com', subject: "test email from Jenkins",
        to: "${address}"
    )
}