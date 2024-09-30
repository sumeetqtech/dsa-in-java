package datastructures.linkedList

class LinkedListKotlin {
    private var head: Node? = null
    private var tail: Node? = null
    private var length = 0

    class Node internal constructor(var value: Int) {
        var next: Node? = null
    }

    fun LinkedList(value: Int) {
        val newNode = Node(value)
        head = newNode
        tail = newNode
        length = 1
    }

    fun printList() {
        var temp = head
        while (temp != null) {
            println(temp.value)
            temp = temp.next
        }
    }

    fun getHead() {
        println("Head: " + head!!.value)
    }

    fun getTail() {
        println("Tail: " + tail!!.value)
    }

    fun getLength() {
        println("Length: $length")
    }

    fun append(value: Int) {
        val newNode = Node(value)
        if (length == 0) {
            head = newNode
        } else {
            tail!!.next = newNode
        }
        tail = newNode
        length++
    }

    fun removeLast(): Node? {
        if (length == 0) {
            println("Nothing to remove since the linked-list is empty")
            return null
        }
        var temp = head
        var pre = head
        while (temp!!.next != null) {
            pre = temp
            temp = temp.next
        }
        tail = pre
        tail!!.next = null
        length--
        if (length == 0) {
            head = null
            tail = null
        }
        return temp
    }

    fun prepend(value: Int) {
        val newNode = Node(value)
        if (length == 0) {
            head = newNode
            tail = newNode
        } else {
            newNode.next = head
            head = newNode
        }

        length++
    }

    fun removeFirst(): Node? {
        if (length == 0) {
            return null
        }
        val temp = head
        head = head!!.next
        temp!!.next = null
        length--

        if (length == 0) {
            head = null
            tail = null
        }

        return temp
    }

    fun get(index: Int): Node? {
        if (index < 0 || index >= length) {
            return null
        }
        var temp = head
        for (i in 0 until index) {
            temp = temp!!.next
        }
        return temp
    }

    fun set(index: Int, value: Int): Boolean {
        val temp = get(index)
        if (temp != null) {
            temp.value = value
            return true
        }
        return false
    }

    fun insert(index: Int, value: Int): Boolean {
        if (index < 0 || index > length) {
            return false
        }

        if (index == 0) {
            prepend(value)
        } else if (index == length) {
            append(value)
        } else {
            val newNode = Node(value)
            val temp = get(index - 1)
            newNode.next = temp!!.next
            temp.next = newNode
            length++
        }

        return true
    }

    fun remove(index: Int): Node? {
        if (index < 0 || index >= length) {
            return null
        }

        when (index) {
            0 -> {
                return removeFirst()
            }
            length - 1 -> {
                return removeLast()
            }
            else -> {
                val prev = get(index - 1)
                val temp = prev!!.next
                prev.next = temp!!.next
                temp.next = null
                length--
                return temp
            }
        }
    }

    fun reverse() {
        var temp = head
        head = tail
        tail = temp
        var after: Node?
        var before: Node? = null

        for (i in 0 until length) {
            after = temp!!.next
            temp.next = before
            before = temp
            temp = after
        }
    }
}