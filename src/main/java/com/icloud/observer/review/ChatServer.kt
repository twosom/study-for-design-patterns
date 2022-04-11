package com.icloud.observer.review

typealias Subject = String


class ChatServer {

    private var subscribers: HashMap<Subject, ArrayList<Subscriber>> = HashMap()

    fun register(subject: Subject, subscriber: Subscriber) {
        if (this.subscribers.hasSubject(subject)) {
            this.subscribers.addSubscriber(subject, subscriber)
        } else {
            this.subscribers.addNewSubjectSubscriber(subject, subscriber)
        }
    }

    fun unregister(subject: Subject, subscriber: Subscriber) {
        if (this.subscribers.hasSubject(subject)) {
            this.subscribers[subject]?.remove(subscriber)
        }
    }

    fun sendMessage(user: User, subject: Subject, message: String) {
        if (this.subscribers.hasSubject(subject)) {
            this.subscribers[subject]?.forEach { s: Subscriber ->
                val userMessage = "from ${user.name} : $message\nto ${(s as User).name}"
                s.handleMessage(userMessage)
            }
        }
    }


    private fun HashMap<Subject, ArrayList<Subscriber>>.hasSubject(subject: Subject): Boolean {
        return this.containsKey(subject)
    }

    private fun HashMap<Subject, ArrayList<Subscriber>>.addSubscriber(subject: Subject, subscriber: Subscriber) {
        this[subject]?.add(subscriber)
    }

    private fun HashMap<Subject, ArrayList<Subscriber>>.addNewSubjectSubscriber(
        subject: Subject,
        subscriber: Subscriber
    ) {
        this[subject] = (this[subject] ?: ArrayList())
        this[subject]!!.add(subscriber)
    }
}