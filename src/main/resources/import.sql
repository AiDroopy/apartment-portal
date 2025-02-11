insert into laundry (id, apartmentId, startTime, endTime ) values(1, 'H', '2025-03-01 12:00:00', '2025-03-01 22:00:00');
insert into laundry (id, apartmentId, startTime, endTime ) values(2, 'B', '2025-03-02 07:00:00', '2025-03-02 12:00:00');
insert into laundry (id, apartmentId, startTime, endTime ) values(3, 'A', '2025-03-03 08:00:00', '2025-03-03 17:00:00');
insert into laundry (id, apartmentId, startTime, endTime ) values(4, 'C', '2025-03-04 10:00:00', '2025-03-04 22:00:00');
alter sequence laundry_seq restart with 5;

insert into post (id, userId, title, body) values(1, 1, 'The first Post', 'Palearktis, och bland lommarna har den det största utbredningsområdet. Smålommen häckar');
insert into post (id, userId, title, body) values(2, 1, 'The second Post', 'Smålommen lever i monogama förhållanden och paret hjälps åt att bygga boet, ruva äggen');
insert into post (id, userId, title, body) values(3, 2, 'The third Post', 'När den flyger har den snabbare vingslag än andra lommar och benen skjuter knappt ut bak');
alter sequence post_seq restart with 4;
