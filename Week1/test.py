class Student:

    count = 0
    grade = 0

    def __init__(self, name, grade) -> None:
        self.grade = grade
        self.name = name

        Student.count += 1
        Student.grade += grade


    def get_info(self):
        return f"{self.grade}, {self.name}"


    @classmethod
    def get_count(cls):
        return f"{cls.count}"


    @classmethod
    def get_grade(cls):
        return f"{cls.grade}"



student1 = Student(97, "Patrick")
student2 = Student(90,"Squidward")

print(Student.get_count())    