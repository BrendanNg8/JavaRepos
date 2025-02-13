import _thread
from _thread import *
from tkinter.tix import Tree
class Brendan:

    count = 0

    def __init__(self, height, hair_color):
        self.height = height
        self.hair_color = hair_color

        Brendan.count += 1


    def get_info(self):
        return f"{self.height}, {self.hair_color}"


    @classmethod
    def get_count(cls):
        return f"{cls.count}"



student = Brendan(5, "black")

print(student.get_info())
print(Brendan.get_count())



    

class BrendansSon(Brendan):
    def __init__(self, height, hair_color):
        super().__init__()



def x():
    while True:
        print("x")

start_new_thread(x,())
while True:
    print("i")