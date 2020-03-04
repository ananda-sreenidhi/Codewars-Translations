#Test Cases:
import random
test.describe('fix add five')
test.expect(addFive(5), 10)
test.expect(addFive(0), 5)
test.expect(addFive(-3), 2)

test.it('Random tests')
for i in range (0,50):
  rand = random.randint(0,50)*1000 + 1
  test.expect(addFive(rand), rand+5)
  
#Sample Test Cases:
test.expect(addFive(2), 7)
test.expect(addFive(8), 13)
test.expect(addFive(12), 17)
test.expect(addFive(1), 6)
