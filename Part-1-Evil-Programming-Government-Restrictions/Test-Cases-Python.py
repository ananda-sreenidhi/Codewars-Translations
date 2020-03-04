#Test Cases:
test.describe('Preliminary tests')
with open('/home/codewarrior/solution.txt', 'r') as myfile:
    solution=myfile.read()
test.assert_equals('len' in solution, False, 'You cannot use len()!')  
for i in range(10):
    test.assert_equals('{}'.format(i) in solution, False, 'You cannot use numbers!')



Test.describe('Basic test')
Test.assert_equals(anarchy(), 'I can write numbers like, 1, 2, 3.')

#Sample Test Cases:
Test.assert_equals(anarchy(), 'I can write numbers like, 1, 2, 3.')
