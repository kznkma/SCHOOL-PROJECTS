import sys
from collections import OrderedDict

def main():
    students = OrderedDict()

    for i in range(1, 4):
        student_number = input(f"Enter student number for classmate {i}: ")
        first_name = input(f"Enter first name for classmate {i}: ")
        students[student_number] = first_name

    print("Current entries in the map:")
    for student_number, first_name in students.items():
        print(f"Student Number: {student_number}, First Name: {first_name}")

    third_key = list(students.keys())[2]
    del students[third_key]

    my_student_number = input("Enter your student number: ")
    my_first_name = input("Enter your first name: ")
    students[my_student_number] = my_first_name

    print("Updated entries in the map:")
    for student_number, first_name in students.items():
        print(f"Student Number: {student_number}, First Name: {first_name}")

if __name__ == "__main__":
    main()
