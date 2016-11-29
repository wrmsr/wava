with open('/Users/spinlock/debugserver', 'rb') as f:
    s = f.read()

slen = len(s)
print(slen)

def fromhex(s):
    return ''.join(chr(int(s[i:i+2], 16)) for i in xrange(0, len(s) - 1, 2))

addr = 0x000000010003960a # lol
src = '7433418B1424B90100008041B80D0000004489FFE8C73201004189450041C745040100000041F6450801752B6641C745080000EB31488D3546B301004C89EFE8E608000031DB88D84883C4385B415C415D415E415F5DC3498B4518'
dst = '7436418B142483E6FDB90100008041B80D0000004489FFE8C43201004189450041C745040100000041F645080175286641C745080000EB2E90909090909090909090909031DB88D84883C4385B415C415D415E415F5DC3498B4518'

src = fromhex(src)
dst = fromhex(dst)
if len(src) != len(dst):
    raise Exception('no')

def findall(needle, haystack):
    i = -1
    while True:
        i = s.find(src, i + 1)
        if i < 0:
            break
        yield i

[pos] = list(findall(src, s))
print(pos)

s = s[:pos] + dst + s[pos + len(dst):]
if len(s) != slen:
    raise Exception('no')

with open('/Users/spinlock/debugserver.hax', 'wb') as f:
    f.write(s)
