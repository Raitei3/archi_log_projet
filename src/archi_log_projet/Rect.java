p a c k a g e   a r c h i _ l o g _ p r o j 
 i m p o r t   j a v a . a w t . P o i n t ; 
 
 i m p o r t   j a v a f x . s c e n e . p a i n t . C o l o r ; 
 
 p u b l i c   c l a s s   R e c t   {   / / e x t e n d s   R e g u l a r P o l y g o n   e n l e v �   j u s t e   p o u r   e n l e v e r   l ' e r r e u r   a   v o i r . 
 
 	 d o u b l e   w i d t h ; 
 	 d o u b l e   h e i g h t ; 
 	 p u b l i c   P o i n t   p o s i t i o n ;   / / o n   v a   p a r t i r   d u   p r i n c i p e   q u e   p o s i t i o n   e s t   l e   c o i n   s u p ��r i e u r   g a u c h e . 
 	 p u b l i c   P o i n t   r o t a t e C e n t e r ;   / /   e t   q u e   r o t a t e C e n t e r   e s t   l e   c e n t r e   d e   l a   f i g u r e . 
 	 p u b l i c   P o i n t   t r a n s l a t i o n ; 
 	 p u b l i c   C o l o r   c o l o r ; 
 	 p u b l i c   b o o l e a n   r o u n d e d A n g l e ; 
 
 	 p u b l i c   R e c t ( d o u b l e   w ,   d o u b l e   h ,   P o i n t   p o s ,   P o i n t   r c ,   P o i n t   t r ,   C o l o r   c ,   b o o l e a n   r a ) { 
 	 	 w i d t h   =   w ; 
 	 	 h e i g h t   =   h ; 
 	 	 p o s i t i o n   =   p o s ; 
 	 	 r o t a t e C e n t e r   =   r c ; 
 	 	 t r a n s l a t i o n   =   t r ; 
 	 	 c o l o r   =   c ; 
 	 	 r o u n d e d A n g l e   =   r a ; 
 	 } 
 
 	 v o i d   u p d a t e R o t a t e C e n t e r ( ) { 
 	 	 d o u b l e   x   =   p o s i t i o n . g e t X ( ) + w i d t h / 2 ; 
 	 	 d o u b l e   y   =   p o s i t i o n . g e t Y ( ) + h e i g h t / 2 ; 
 	 	 r o t a t e C e n t e r . s e t L o c a t i o n ( x ,   y ) ; 
 	 } 
 
 	 p u b l i c   d o u b l e   g e t W i d t h ( )   { 
 	 	 r e t u r n   w i d t h ; 
 	 } 
 
 	 p u b l i c   v o i d   s e t W i d t h ( d o u b l e   w i d t h )   { 
 	 	 t h i s . w i d t h   =   w i d t h ; 
 	 	 u p d a t e R o t a t e C e n t e r ( ) ; 
 	 } 
 
 	 p u b l i c   d o u b l e   g e t H e i g h t ( )   { 
 	 	 r e t u r n   h e i g h t ; 
 	 } 
 
 	 p u b l i c   v o i d   s e t H e i g h t ( d o u b l e   h e i g h t )   { 
 	 	 t h i s . h e i g h t   =   h e i g h t ; 
 	 	 u p d a t e R o t a t e C e n t e r ( ) ; 
 	 } 
 
 	 p u b l i c   P o i n t   g e t P o s i t i o n ( )   { 
 	 	 r e t u r n   p o s i t i o n ; 
 	 } 
 
 	 p u b l i c   v o i d   s e t P o s i t i o n ( P o i n t   p o s i t i o n )   { 
 	 	 t h i s . p o s i t i o n   =   p o s i t i o n ; 
 	 	 u p d a t e R o t a t e C e n t e r ( ) ; 
 	 } 
 
 	 p u b l i c   P o i n t   g e t R o t a t e C e n t e r ( )   { 
 	 	 r e t u r n   r o t a t e C e n t e r ; 
 	 } 
 
 	 p u b l i c   v o i d   s e t R o t a t e C e n t e r ( P o i n t   r o t a t e C e n t e r )   { 
 	 	 t h i s . r o t a t e C e n t e r   =   r o t a t e C e n t e r ; 
 	 } 
 
 	 p u b l i c   P o i n t   g e t T r a n s l a t i o n ( )   { 
 	 	 r e t u r n   t r a n s l a t i o n ; 
 	 } 
 
 	 p u b l i c   v o i d   s e t T r a n s l a t i o n ( P o i n t   t r a n s l a t i o n )   { 
 	 	 t h i s . t r a n s l a t i o n   =   t r a n s l a t i o n ; 
 	 } 
 
 	 p u b l i c   C o l o r   g e t C o l o r ( )   { 
 	 	 r e t u r n   c o l o r ; 
 	 } 
 
 	 p u b l i c   v o i d   s e t C o l o r ( C o l o r   c o l o r )   { 
 	 	 t h i s . c o l o r   =   c o l o r ; 
 	 } 
 
 	 p u b l i c   b o o l e a n   i s R o u n d e d A n g l e ( )   { 
 	 	 r e t u r n   r o u n d e d A n g l e ; 
 	 } 
 
 	 p u b l i c   v o i d   s e t R o u n d e d A n g l e ( b o o l e a n   r o u n d e d A n g l e )   { 
 	 	 t h i s . r o u n d e d A n g l e   =   r o u n d e d A n g l e ; 
 	 } 
 
 
 
 
 } 
 