CREATE TABLE IF NOT EXISTS public.checkpoint (
	id serial primary key not null,
	worker varchar(175),
	started_at timestamp without time zone,
	end_at timestamp without time zone
);
CREATE UNIQUE INDEX IF NOT EXISTS checkpoint_worker_unique ON public.checkpoint USING btree (worker);
