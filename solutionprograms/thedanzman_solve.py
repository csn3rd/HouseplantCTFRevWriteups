import base64
import codecs
def checkpass():
  key = "nyameowpurrpurrnyanyapurrpurrnyanya"
  key = codecs.encode(key, "rot_13")
  result = "'=ZkXipjPiLIXRpIYTpQHpjSQkxIIFbQCK1FR3DuJZxtPAtkR'o"
  result = (codecs.decode(result, 'rot_13'))
  result = wow(result)
  result = result[2:len(result)-1:1]

  result = base64.b64decode(result, altchars=None).decode('utf-8')

  ans = nope(key, result)
  print(ans)

def main():
    access = checkpass()

def nope(s1,s2):
    return ''.join(chr(ord(a) ^ ord(b)) for a,b in zip(s1,s2))

def wow(x):
  return x[::-1]


access = False
main()
