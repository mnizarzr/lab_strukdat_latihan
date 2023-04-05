class Stack:
    def __init__(self):
        self.items = []

    def __str__(self):
        return str(self.items)

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if not self.is_empty():
            return self.items.pop()

    def peek(self):
        if not self.is_empty():
            return self.items[-1]

    def is_empty(self):
        return len(self.items) == 0

    def size(self):
        return len(self.items)

    def search(self, item):
        pos = len(self.items)
        for i in range(pos - 1, -1, -1):
            if self.items[i] == item:
                return pos - i
        return -1


stack = Stack()

stack.push("Aku")
stack.push("Anak")
stack.push("Indonesia")

print("Next: ", stack.peek())
stack.push("Raya")
print(stack.pop())
stack.push("!")

count = stack.search("Aku")
while count != -1 and count > 1:
    stack.pop()
    count -= 1

print(stack.pop())
print(stack.is_empty())
