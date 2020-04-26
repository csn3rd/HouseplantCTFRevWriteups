import base64
def checkpass():
  key = "meownyameownyameownyameownyameownya"
  result = b'HxEMBxUAURg6I0QILT4UVRolMQFRHzokRBcmAygNXhkqWBw='
  result = base64.b64decode(result, altchars=None).decode('utf-8')

  print(woah(key, result))

def main():
    access = checkpass()

def woah(s1,s2):
    return ''.join(chr(ord(a) ^ ord(b)) for a,b in zip(s1,s2))

access = False
main()

