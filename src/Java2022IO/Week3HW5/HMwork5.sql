SELECT ContactName Adi, CompanyName Sirketadi, City Sehir FROM Customers

SELECT * FROM Customers WHERE City = 'Paris'


SELECT * FROM Products WHERE CategoryID = 1 or CategoryID = 3

SELECT * FROM Products WHERE CategoryID = 1 and UnitPrice >= 10


SELECT * FROM Products ORDER BY CategoryID,ProductName

SELECT * FROM Products ORDER BY UnitPrice  ASC --Ascending

SELECT * FROM Products ORDER BY UnitPrice  DESC --Descending

SELECT * FROM Products WHERE CategoryID = 2 ORDER BY UnitPrice  DESC

SELECT count(*) FROM Products

SELECT count(*) Adet FROM Products

SELECT * FROM Products  

SELECT CategoryID, count(*) FROM Products GROUP BY CategoryID

SELECT CategoryID, count(*) FROM Products GROUP BY CategoryID HAVING count(*) < 10

SELECT CategoryID, count(*) FROM Products WHERE UnitPrice > 20 GROUP BY CategoryID HAVING count(*) < 10

SELECT * FROM Products 
inner join Categories ON Products.CategoryID = Categories.CategoryID


SELECT Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
FROM Products 
inner join Categories ON Products.CategoryID = Categories.CategoryID


--C# dilinde, DTO Data Transformation Object

SELECT Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName 
FROM Products 
inner join Categories ON Products.CategoryID = Categories.CategoryID
WHERE Products.UnitPrice>10

-- Inner Join: Sadece iki tabloda da eþleþenleri bir araya getirir.
-- Eþleþmeyen veriyi getirmez.

SELECT * FROM Products p 
inner join [Order Details] od ON p.ProductID = od.ProductID

-- Left Join: Solda (Products) olup saðda ([Order Details]) olmayanlarý da getirir

SELECT * FROM Products p 
left join [Order Details] od ON p.ProductID = od.ProductID

SELECT * FROM Customers c 
left join Orders o ON c.CustomerID = o.CustomerID
WHERE o.CustomerID is null 


SELECT * FROM Customers c 
right join Orders o ON c.CustomerID = o.CustomerID

SELECT * FROM Products p 
inner join [Order Details] od ON p.ProductID = od.ProductID
inner join Orders o ON o.OrderID = od.OrderID 