CREATE OR REPLACE VIEW vs_presupuestos AS 
 SELECT p.fecha, p.idempleado,(em.nombre::text || ' '::text) || em.apellidos::text AS nombreyapellidos,p.idcliente,  cli.cliente, cli.ruc, pd.idpresupuesto,pd.idpresudet,p.estado, 
 pd.idmercaderia, mer.descripcion, pd.cantidad, pd.precio,pd.iva5,pd.iva10,pd.ivaexenta, (pd.iva5 + pd.iva10)+ pd.ivaexenta AS totalpresupuesto,
  pd.totiva5,pd.totiva10
   FROM presupuesto p
   LEFT JOIN empleados em ON em.idempleado = p.idempleado
   LEFT JOIN clientes cli ON cli.idcliente = p.idcliente
   LEFT JOIN presupuesto_detalles pd ON pd.idpresupuesto = p.idpresupuesto
   LEFT JOIN mercaderias mer ON mer.idmercaderia = pd.idmercaderia;


