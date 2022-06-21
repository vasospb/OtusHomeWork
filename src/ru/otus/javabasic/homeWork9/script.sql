create table question (
id SERIAL          PRIMARY KEY,
    question varchar(300)
);

create table answers(
    id serial primary key,
    answer varchar(300) not null,
    questionId integer references question(id)
);

INSERT INTO public.question(
	id, question)
	VALUES (1, 'Сколько месяцев в Феврале');
INSERT INTO public.question(
	id, question)
	VALUES (2, 'Сколько месяцев в Феврале');
INSERT INTO public.question(
	id, question)
	VALUES (3, 'Сколько месяцев в Феврале');
    
    
select * from question;





INSERT INTO public.answers(
	id, answer, questionid)
	VALUES (1, '12', 1);
    
INSERT INTO public.answers(
	id, answer, questionid)
	VALUES (2, '14', 1);    
    
INSERT INTO public.answers(
	id, answer, questionid)
	VALUES (3, '11', 1);    

ALTER TABLE IF EXISTS public.answers
    ADD COLUMN "rightAnswer" boolean;	
    
INSERT INTO public.answers(
	id, answer, questionid, "rightAnswer")
	VALUES (5, '31', 2, 'false');  
    
INSERT INTO public.answers(
	id, answer, questionid, "rightAnswer")
VALUES (4, '30', 2, 'y');    
    
INSERT INTO public.answers(
	id, answer, questionid, "rightAnswer")
	VALUES (6, '31', 3, false);    
INSERT INTO public.answers(
	id, answer, questionid,"rightAnswer")
	VALUES (7, '28', 3, true);
    
update  answers set "rightAnswer" = TRUE
where id = 1;
    
select * from answers;