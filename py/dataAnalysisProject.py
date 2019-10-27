# Imports
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns

# Data analysis
df = pd.read_csv('insurance.csv')
df.head()

# region column is useless so deleted
del df['region']
df['smoker'] = df['smoker'].apply(lambda x: 1 if x=="yes" else 0)
df['sex'] = df['sex'].apply(lambda x: 1 if x=="male" else 0)

# getting correlation
corr = df.corr()
corr

# plot 1 correlation heatmap
fig, ax = plt.subplots(figsize=(10,8))
sns.heatmap(corr,cmap="RdYlGn")
# old code that uses matplotlib only
#ax.set_xticks(np.arange(len(df.columns)))
#ax.set_yticks(np.arange(len(df.columns)))
#ax.set_xticklabels(df.columns)
#ax.set_yticklabels(df.columns)

# plot 2 charges
# for smokers
fig, ax = plt.subplots(figsize=(6,5))
plt.title("Charge distribution for smokers")
sns.distplot(df[(df['smoker']==1)]['charges'],color='r',kde=False)

# for non-smokers
fig, ax = plt.subplots(figsize=(6,5))
plt.title("Charge distribution for non-smokers")
sns.distplot(df[(df['smoker']==0)]['charges'],color='g',kde=False)

# plot 3 smoking-gender classified
a = sns.catplot(x='smoker', kind='count',hue = 'sex', palette='plasma', data=df,legend_out=False)
leg = a.axes.flat[0].get_legend()
labels = ['Female','Male']
for t, l in zip(leg.texts, labels): t.set_text(l)

# plot 4 19 year old smokers
a = sns.catplot(x='smoker', kind='count',hue = 'sex', palette='prism', data=df[(df.age==19)],legend_out=False)
leg = a.axes.flat[0].get_legend()
labels = ['Female','Male']
for t, l in zip(leg.texts, labels): t.set_text(l)

# plot 5 19 year olds' medical charges compared (box plot)
fig, ax = plt.subplots(figsize=(12,5))
sns.catplot(y='smoker',x='charges',kind='box',orient='h', palette='prism', data=df[(df.age==19)],legend_out=False,ax=ax)
plt.title("Box plot for charges 19 years old smokers")
