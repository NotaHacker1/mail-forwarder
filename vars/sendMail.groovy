#!groovy

class sendMail(name, address) {
    mail body: "Dear ${name} testy testy testington",
    subject: "test email from Jenkins",
    to: "${address}";
}