  <!DOCTYPE html>  
    <html>  
    <body>
     <form action="checkout">
    
    <p>Your reservation is confirmed successfully. Please, re-check the details.</p>  
    First Name : ${reservation.firstName} <br>  
    Last Name : ${reservation.lastName}  <br>
    Gender : ${reservation.gender}
  <br></br>

     
Meals:${reservation.food}   
<%-- <ul>  
<c:forEach var="meal" items="${reservation.food}">  
<li>${meal}</li>  
</c:forEach>  

 
 </ul>  
 --%>        
  <input type="submit" value="logout">
    </form>
    </body>  
    </html>  