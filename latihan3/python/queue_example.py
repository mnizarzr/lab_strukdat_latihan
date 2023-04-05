class Queue:
    def __init__(self):
        self.items = []

    def __str__(self):
        return str(self.items)

    def add(self, item):
        self.items.append(item)

    def remove(self):
        if not self.is_empty():
            return self.items.pop(0)
        else:
            raise Exception("Queue is empty")

    def peek(self):
        if not self.is_empty():
            return self.items[0]

    def is_empty(self):
        return len(self.items) == 0

    def size(self):
        return len(self.items)

    def poll(self):
        if not self.is_empty():
            return self.items.pop(0)
        else:
            return None

    def element(self):
        if not self.is_empty():
            return self.items[0]
        else:
            raise Exception("Queue is empty")


queue = Queue()
queue.add("Java")
queue.add("DotNet")
queue.add("PHP")
queue.add("HTML")

print("Remove\t: ", queue.remove())
print("Element\t: ", queue.element())
print("Poll\t: ", queue.poll())
print("Peek\t: ", queue.peek())
print("Queue\t: ", queue)
