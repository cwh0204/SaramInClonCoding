function Badge({ children }) {
  return (
    <span className="inline-flex items-center h-[24px] px-[8px] border border-[#d1d5db] rounded-[4px] text-[12px] text-[#555] bg-white">
      {children}
    </span>
  );
}

export default Badge;
