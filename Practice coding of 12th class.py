# -*- coding: utf-8 -*-
"""
Created on Thu Oct  8 12:23:38 2020

@author: Anish
"""

from sklearn.preprocessing import MinMaxScaler
from sklearn.neighbors import KNeighborsClassifier
from sklearn.preprocessing import LabelEncoder,MinMaxScaler
from sklearn.tree import DecisionTreeClassifier
from sklearn.ensemble import RandomForestClassifier
from sklearn.naive_bayes import MultinomialNB
from sklearn.model_selection import train_test_split
from sklearn.metrics import confusion_matrix,accuracy_score
import joblib as jl
import pandas as pd

a=pd.read_csv("iris.csv")
print(a)
a.isna().sum()
a['Species']=a['Species'].astype('category')
print(a.dtypes)

ind=a.drop('Species',axis=1)
dep=a['Species']

xtrain,xtest,ytrain,ytest=train_test_split(ind,dep,test_size=0.2)

model=MultinomialNB()
c=model.fit(xtrain,ytrain)

pred=model.predict(xtest)
print(pred)
e=confusion_matrix(pred,ytest)
f=accuracy_score(pred,ytest)
print(e)
print()
print(f)

jl.dump(model,r"C:\Users\abc\anaconda3\Anish's Model.h5")
