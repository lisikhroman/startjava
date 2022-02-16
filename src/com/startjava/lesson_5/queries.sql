/*выведите всю таблицу*/
SELECT * FROM jaegers;
/*отобразите только не уничтоженных роботов*/
SELECT * FROM jaegers where status != 'Destroyed';
/*отобразите роботов нескольких серий, например Mark-1 и Mark-6*/
SELECT * FROM jaegers where mark = 'Mark-1' or mark = 'Mark-6';
/*отсортируйте таблицу по убыванию по столбцу mark*/
SELECT * FROM jaegers order by mark desc;
/*отобразите самого старого робота*/
SELECT * FROM jaegers order by launch asc limit 1;
/*отобразите роботов, которые уничтожили больше/меньше всех kaiju*/
SELECT * FROM jaegers where kaijukill = (SELECT max(kaijukill) FROM jaegers) or kaijukill = (SELECT min(kaijukill) FROM jaegers);
/*отобразите средний вес роботов*/
SELECT avg(weight) FROM jaegers;
/*увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены*/
UPDATE jaegers SET kaijukill = kaijukill + 1 WHERE status != 'Destroyed';
/*удалите уничтоженных роботов*/
DELETE FROM jaegers WHERE status = 'Destroyed';