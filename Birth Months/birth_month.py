def main():
    group1 = set()
    group2 = set()
    self = set()

    my_birth_month = input("Enter your birth month: ")
    self.add(my_birth_month)

    for i in range(1, 7):
        birth_month = input(f"Enter birth month of classmate {i}: ")
        if i <= 3:
            group1.add(birth_month)
        else:
            group2.add(birth_month)

    print("Group 1 birth months:", group1)
    print("Group 2 birth months:", group2)

    union = group1.union(group2)
    print("Union of both groups:", union)

    intersection = group1.intersection(group2)
    print("Intersection of both groups:", intersection)

    difference = group1.difference(group2)
    print("Difference of group1 from group2:", difference)

    if my_birth_month in group1 or my_birth_month in group2:
        print("You have the same birth month with one of your classmates.")
    else:
        print("You do not have the same birth month with any of your classmates.")

if __name__ == "__main__":
    main()
