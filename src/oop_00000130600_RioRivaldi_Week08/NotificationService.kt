package oop_00000130600_RioRivaldi_Week08


class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke : $emailAddress")
    }

    fun processUser(user: UserProfile) {
        val email = user.email
        if (email != null) {
            sendEmail(email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }


}