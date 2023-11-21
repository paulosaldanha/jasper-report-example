CREATE TABLE public.product (
	id serial4 NOT NULL,
	"name" varchar NULL,
	description varchar NULL,
	price numeric NULL
);

INSERT INTO public.product
("name", description, price)
VALUES('teste', 'teste descricao', 10);