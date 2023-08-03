1.-
select p.nombre,dp.Cantidad from
plato p join detalle_pedido dp
on id = Plato_ID
where  Pedido_ID=1 ;
2.-
select m.numero,count(dp.Cantidad) cantidad from mesa m
join pedido p
on m.id = p.mesa_id
join detalle_pedido dp
on p.id = dp.Pedido_ID
group by m.Numero;
3.-
select c.nombre,sum(dp.Subtotal) ventas from camarero c
join pedido p
on c.id = p.camarero_id
join detalle_pedido dp
on p.id = dp.Pedido_ID
group by c.Nombre
order by c.Nombre desc ;
4.-
select p.nombre,count(dp.Cantidad) cantidad from
plato p join detalle_pedido dp
on id = Plato_ID
group by p.nombre
order by cantidad desc
limit 1;
5.-
select p.nombre,count(dp.Cantidad) cantidad,sum(p.Precio) precio  from
plato p join detalle_pedido dp
on id = Plato_ID
group by p.nombre
order by p.Nombre desc;