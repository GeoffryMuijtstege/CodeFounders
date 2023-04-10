print("Start csv read application")

import pandas

df  = pandas.read_csv('pokemon.csv')
print(df["Name"])
print(df["Total"])

for r,rij in df.iterrows():
#    print(r)
#   print(rij)
    print(rij["Name"])