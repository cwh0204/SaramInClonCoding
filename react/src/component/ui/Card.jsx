function Card({ children, className = "" }) {
  return <div className={`bg-white border border-[#e5e7eb] rounded-[8px] ${className}`}>{children}</div>;
}

export default Card;
