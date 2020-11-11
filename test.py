file = open('C:\\Users\\matth\\Desktop\\tempe.txt', 'r', encoding = "UTF-8")
the_list = []
for line in file.readlines():
    line = line.strip('\n')
    if len(line) == 0:
        pass
    elif "CHI" not in line:
        pass
    else:
        the_list.append(line)

new_file = open('C:\\Users\\matth\\Desktop\\tempo.txt', 'w')
for line in the_list:
    the_index = line.index("I")
    new_file.write(line[the_index + 3:] + '\n')

new_file.close()



'''
file = open('C:\\Users\\matth\\Desktop\\tempe.txt', 'r', encoding = "UTF-8")
the_list = []
for line in file.readlines():
    line = line.strip('\n')
    if len(line) == 0:
        pass
    elif line[0] != '@':
        pass
    else:
        the_list.append(line)
print(the_list)
print(len(the_list))
'''




'''
file = open('C:\\Users\\matth\\Desktop\\totally temporary.txt', 'r')
for line in file.readlines():
    a = line.split(',')
print(len(a))
'''

'''
file = open('kor.txt', 'r', encoding = "UTF-8")
new_list = []
for wordo in file.readlines():
    wordo = wordo.strip('CONJUGATE ').strip('PLAY').split(' = ')
    new_list.append(wordo)

while ['\n'] in new_list:
    new_list.remove(['\n'])

new_file = open('newkor.txt', 'w', encoding = 'UTF-8')
for i in range(len(new_list)):
    new_file.write(new_list[i][0] + '\n')
for i in range(len(new_list)):
    new_file.write(new_list[i][1])
new_file.close()
'''