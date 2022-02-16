CREATE TABLE public.Jaegers
    (
       id int NOT NULL, 
       modelName varchar(50) NOT NULL, 
       mark varchar(50) NOT NULL, 
       height float4 NOT NULL,
       weight float4 NOT NULL,
	   status varchar(50) NOT NULL, 
       origin varchar(50) NOT NULL,
       launch timestamp NOT NULL,
       kaijuKill int NOT NULL
    );