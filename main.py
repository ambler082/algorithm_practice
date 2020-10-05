class Node(object) :
    def __init__(self, data) :
        self.data = data
        self.next = None


class Link(object) :
    def __init__(self) :
        self.head = None

    def push(self,node):
        if self.head == None :
            self.head = node
            return

        else :
            cur = self.head
            while cur.next != None :
                cur = cur.next
            cur.next = node

    def pop(self) :
        if self.head == None :
            print("No element")
            return

        else :
            cur = self.head
            prev = None
            nextn = self.head.next
            while cur.next != None :
                prev = cur
                cur = cur.next

            if prev == None :
                self.head = self.head.next

            else :
                prev.next = None

    def print(self) :
        if self.head == None :
            print("No Stack")
            return

        cur = self.head
        while cur != None :
            print(cur.data)
            cur = cur.next

if __name__ == "__main__" :
    s1 = Link()
    s1.push(Node(3))
    s1.pop()
    s1.pop()
    s1.print()