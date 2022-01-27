alter database zeebe_poc owner to zeebe_poc;
\connect zeebe_poc;
GRANT ALL PRIVILEGES ON SCHEMA zeebe_poc TO GROUP zeebe_poc;
CREATE TABLE public.checkpoint (id serial primary key not null, worker varchar(175), started_at timestamp without time zone, end_at timestamp without time zone);
CREATE UNIQUE INDEX checkpoint_worker_unique ON public.checkpoint USING btree (worker);
